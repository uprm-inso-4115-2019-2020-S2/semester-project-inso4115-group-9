package dao

import models.{UserId, User}
import slick.jdbc.PostgresProfile.api._
import scala.concurrent.Future

object UsersDao extends BaseDao{
  def findAll: Future[Seq[User]] = usersTable.result
  def findById(userId: UserId): Future[User] = usersTable.filter(_.id === userId).result.head
  def create(user: User): Future[UserId] = usersTable returning usersTable.map(_.id) += user
  def update(newUser: User, userId: UserId): Future[Int] = usersTable.filter(_.id === userId)
    .map(user => (user.firstname, user.lastname, user.email, user.gender, user.date_birth, user.request_completed))
    .update((newUser.firstname, newUser.lastname, newUser.email, newUser.gender, newUser.date_birth, newUser.request_completed))

  def delete(userId: UserId): Future[Int] = usersTable.filter(_.id === userId).delete

}
