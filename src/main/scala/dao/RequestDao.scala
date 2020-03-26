package dao

import models.{RequestId, Request}
import slick.jdbc.PostgresProfile.api._
import scala.concurrent.Future

object RequestDao extends BaseDao{
  def findAll: Future[Seq[Request]] = requestTable.result
  def findById(requestId: RequestId): Future[Request] = requestTable.filter(_.id === requestId).result.head
  def create(request: Request): Future[RequestId] = requestTable returning requestTable.map(_.id) += request
  def update(newRequest: Request, requestId: RequestId): Future[Int] = requestTable.filter(_.id === requestId)
    .map(request => (request.donation, request.quantity, request.date, request.status))
    .update((newRequest.donation, newRequest.quantity, newRequest.date, newRequest.status))

  def delete(requestId: RequestId): Future[Int] = requestTable.filter(_.id === requestId).delete

}
