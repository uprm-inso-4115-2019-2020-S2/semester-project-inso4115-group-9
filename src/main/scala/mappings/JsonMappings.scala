package mappings

import models.{User, Request}
import spray.json.DefaultJsonProtocol

trait JsonMappings extends DefaultJsonProtocol {
  implicit val userFormat = jsonFormat7(User)
  implicit val requestFormat = jsonFormat5(Request)
}