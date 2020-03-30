package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import scala.concurrent.ExecutionContext.Implicits.global

import services.{UserServices}

@Singleton
class User @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def index = Action.async { implicit request =>
        UserServices.findAll map { user =>
        Ok(Json.toJson(user))
    }
  }
}