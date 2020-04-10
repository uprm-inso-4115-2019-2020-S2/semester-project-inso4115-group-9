package models

import slick.jdbc.PostgresProfile.api._

object DatabaseConnection {
  val connection = Database.forURL("jdbc:postgresql://localhost:5432/inso4115", "postgres", "etorresco")
}