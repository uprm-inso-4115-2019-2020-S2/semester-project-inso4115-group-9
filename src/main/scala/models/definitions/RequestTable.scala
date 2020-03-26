package models.definitions

import models.{Request, RequestId}
import slick.jdbc.PostgresProfile.api._

class RequestTable(tag: Tag) extends Table[Request](tag, "request"){
  def id = column[RequestId]("id", O.PrimaryKey, O.AutoInc)
  def donation = column[String]("donation")
  def quantity = column[Int]("quantity")
  def date: Rep[String] = column[String]("date")
  def status = column[String]("status")
  def * = (id.?, donation, quantity, date, status) <> ((Request.apply _).tupled, Request.unapply)
}

