package models

case class Request(id: Option[RequestId], donation: String, quantity: Int, time: String, status: String)
