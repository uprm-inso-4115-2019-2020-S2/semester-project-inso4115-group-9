package controllers

import javax.inject.Inject
import models.User
import play.api.data._
import play.api.mvc._
import services.UserServices


class Register @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc){
  import RegisterForm._

  private val postUrl = routes.User.index()

  def index: Action[AnyContent] = Action {
    Ok(views.html.index())
  }

  def listUsers: Action[AnyContent] = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.register(form, postUrl))
  }

  def goToLogin: Action[AnyContent] = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.login())
  }

  // This will be the action that handles our form post
  def createUser: Action[AnyContent] = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[Data] =>
      // This is the bad case, where the form had validation errors.
      // Let's show the user the form again, with the errors highlighted.
      // Note how we pass the form with errors to the template.
      BadRequest(views.html.register(formWithErrors, postUrl))
    }

    val successFunction = { data: Data =>
      // This is the good case, where the form was successfully parsed as a Data object.
      val user = User(id=1, firstname = data.firstname, lastname = data.lastname, email= data.email,
        gender = data.gender.toString, phone = data.phone , date_birth = data.date_birth.toString,  requests_completed = 0)

      UserServices.create(user)
      Redirect(routes.User.index()).flashing("success" -> "Successfully registered!")
    }

    val formValidationResult = form.bindFromRequest
    formValidationResult.fold(errorFunction, successFunction)
  }
}
