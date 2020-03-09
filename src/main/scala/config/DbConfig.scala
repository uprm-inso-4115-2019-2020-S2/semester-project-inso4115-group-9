package config

trait DbConfig extends Config {
  val driver = slick.jdbc.PostgresProfile

  import driver.api._

  def db = Database.forConfig("database")

  implicit val session: Session = db.createSession()
}
