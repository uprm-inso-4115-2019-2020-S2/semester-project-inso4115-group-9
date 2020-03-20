package api

import dao.RequestDao

import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import mappings.JsonMappings
import models.Request
import akka.http.scaladsl.server.Directives._
import spray.json._

trait RequestApi extends JsonMappings{
  val requestApi =
    (path("request") & get ) {
      complete (RequestDao.findAll.map(_.toJson))
    }~
      (path("request"/IntNumber) & get) { id =>
        complete (RequestDao.findById(id).map(_.toJson))
      }~
      (path("request") & post) { entity(as[Request]) { request =>
        complete (RequestDao.create(request).map(_.toJson))
      }
      }~
      (path("request"/IntNumber) & put) { id => entity(as[Request]) { request =>
        complete (RequestDao.update(request, id).map(_.toJson))
      }
      }~
      (path("request"/IntNumber) & delete) { requestId =>
        complete (RequestDao.delete(requestId).map(_.toJson))
      }
}
