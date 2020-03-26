package models

case class Request(id: Option[RequestId], donation: String, quantity: Int, date: String, status: String)
