import akka.http.scaladsl.server.Directives._
import api.{ApiErrorHandler, UsersApi, RequestApi}

trait Routes extends ApiErrorHandler with UsersApi with RequestApi{
  val routes =
    pathPrefix("rest") {
      usersApi ~
      requestApi
    } ~ path("")(getFromResource("public/index.html"))
}
