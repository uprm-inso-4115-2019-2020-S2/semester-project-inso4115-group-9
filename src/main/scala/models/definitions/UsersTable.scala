package models.definitions

import models.{User, UserId}
import slick.jdbc.PostgresProfile.api._

class UsersTable(tag: Tag) extends Table[User](tag, "users"){
  def id = column[UserId]("id", O.PrimaryKey, O.AutoInc)
  def firstname = column[String]("firstname")
  def lastname = column[String]("lastname")
  def email: Rep[String] = column[String]("email")
  def gender = column[Char]("gender")
  def date_birth: Rep[String] = column[String]("date_birth")
  def request_completed = column[Int]("request_completed")
  def * = (id.?, firstname, lastname, email, gender, date_birth, request_completed) <> ((User.apply _).tupled, User.unapply)
}

