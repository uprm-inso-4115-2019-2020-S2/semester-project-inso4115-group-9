package mappings

import models.User
import spray.json.DefaultJsonProtocol

trait JsonMappings extends DefaultJsonProtocol {
  implicit val userFormat = jsonFormat7(User)
}