package models

case class User(id: Option[UserId], firstname: String, lastname: String, email: String, gender: Char, date_birth: String, request_completed: Int)
