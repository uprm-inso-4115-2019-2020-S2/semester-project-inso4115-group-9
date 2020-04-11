package controllers
import javax.inject.Inject
import models.User
import play.api.data.Forms.mapping
import play.api.mvc._
import services.UserServices
import play.api.data.Forms._
import play.api.data.Form
import play.filters.csrf.{CSRFAddToken, CSRFCheck}


case class RegisterData(firstName: String,
                        lastName:String,
                        email: String,
                        gender: String,
                        date_birth : String,
                        phone: String,
                        password: String,
                        retypePassword: String,
                       )

class Register @Inject()(addToken: CSRFAddToken,
                         checkToken: CSRFCheck,
                         cc: MessagesControllerComponents) extends MessagesAbstractController(cc){



  val registerForm = Form(
    mapping(
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "email" -> nonEmptyText,
      "gender" -> text,
      "date_birth" -> nonEmptyText,
      "phone" -> nonEmptyText,
      "password" -> text,
      "retypePassword" -> text,
    )(RegisterData.apply)(RegisterData.unapply)
  )


  def index: Action[AnyContent] = Action {
    Ok(views.html.index())
  }

  def validateRegisterInfo: Boolean = {
    true
  }

  def goToRegister: Action[AnyContent] = addToken {
    Action { implicit request =>
      // Calls the form
      Ok(views.html.register(registerForm))
    }
  }

  def goToLogin: Action[AnyContent] = Action { implicit request =>
    Ok(views.html.login())
  }


  // This will be the action that handles our form post
  def createUser: Action[AnyContent] = checkToken { Action { implicit request =>
    registerForm.bindFromRequest().fold(
      formWithErrors => {
        BadRequest(views.html.register(formWithErrors))
      },
      rd => {
//        val user = User(None, rd.firstName, rd.lastName, rd.email, "M", rd.phone, rd.date_birth.toString, 0)
        val user = User(None, rd.firstName, rd.lastName,rd.email, rd.gender,rd.phone, rd.date_birth.toString,0)
        UserServices.create(user)
        Redirect(routes.User.index()).flashing("Success" -> "Registered Successfully")
      }
    )
  }
  }
}
