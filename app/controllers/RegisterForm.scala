package controllers

object RegisterForm{
  import play.api.data.Forms._
  import play.api.data.Form


  /**
    * A form processing DTO that maps to the form below.
    *
    * Using a class specifically for form binding reduces the chances
    * of a parameter tampering attack and makes code clearer.
    */
  case class Data(firstname: String,
                  lastname:String,
                  email: String,
                  gender: Char,
                  date_birth : java.util.Date,
                  phone: String,
                  request_completed : Boolean)

  /**
    * The form definition for the "create a widget" form.
    * It specifies the form fields and their types,
    * as well as how to convert from a Data to form data and vice versa.
    */
  val form = Form(
    mapping(
      "firstname" -> nonEmptyText,
      "lastname" -> nonEmptyText,
      "email" -> email,
      "gender" -> char,
      "date_birth" -> date,
      "phone" -> nonEmptyText,
      "request_completed" -> checked("Completed Request")
    )(Data.apply)(Data.unapply)
  )

}
