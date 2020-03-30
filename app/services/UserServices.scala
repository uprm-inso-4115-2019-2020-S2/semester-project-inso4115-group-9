package services

import models.{User, UsersTable, DatabaseConnection}
import slick.jdbc.PostgresProfile.api._
import slick.lifted.TableQuery

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

// User Data Access Object
object UserServices {
    val db = DatabaseConnection.connection
    val users = TableQuery[UsersTable]

    def findAll: Future[Seq[User]] = {
        db.run(users
        .sortBy(_.id)
        .result)
    }

    def findById(id: Int): Future[Option[User]] = {
        db.run(users
        .filter(_.id === id)
        .result
        .headOption)
    }

    def create(user: User): Future[String] = {
        db.run(users += user)
        .map(res => "User successfully added")
        .recover {
            case ex: Exception => ex.getCause.getMessage
        }
    }

    def update(newUser: User, userId: Int): Future[String] = {
        db.run(users
            .filter(_.id === userId)
            .update(newUser))
            .map(res => s"User $newUser.id successfully updated")
            .recover {
            case ex: Exception => ex.getCause.getMessage
            }
    }

    def delete(id: Int): Future[Int] = {
        db.run(users
        .filter(_.id === id)
        .delete)
  }

}