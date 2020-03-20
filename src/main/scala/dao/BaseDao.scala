package dao

import config.DbConfig
import models.definitions.{UsersTable, RequestTable}
import slick.dbio.{Effect, NoStream}
import slick.lifted.TableQuery
import slick.sql.{FixedSqlStreamingAction, SqlAction}

import scala.concurrent.Future

trait BaseDao extends DbConfig {
  val usersTable = TableQuery[UsersTable]
  val requestTable = TableQuery[RequestTable]

  protected implicit def executeFromDb[A](action: SqlAction[A, NoStream, _ <: slick.dbio.Effect]): Future[A] = {
    db.run(action)
  }
  protected implicit def executeReadStreamFromDb[A](action: FixedSqlStreamingAction[Seq[A], A, _ <: slick.dbio.Effect]): Future[Seq[A]] = {
    db.run(action)
  }
}
