package models

import slick.jdbc.PostgresProfile.api._
import slick.lifted.Tag
import play.api.libs.json.Json

// Create our User type as a standard case class
case class User(id: Option[Int],
                firstname: String,
                lastname: String,
                email: String,
                gender: String,
                phone: String,
                date_birth: String,
                requests_completed: Int)

// User Table
class UsersTable(tag: Tag) extends Table[User](tag, "users"){
  def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  def firstname = column[String]("firstname")
  def lastname = column[String]("lastname")
  def email: Rep[String] = column[String]("email")
  def gender = column[String]("gender")
  def phone = column[String]("phone")
  def date_birth: Rep[String] = column[String]("date_birth")
  def requests_completed = column[Int]("requests_completed")

  def * = (id.?, firstname, lastname, email, gender, phone, date_birth, requests_completed) <> ((User.apply _).tupled, User.unapply)
}

// User Json Formatter
object User {
  implicit val format = Json.format[User]
}