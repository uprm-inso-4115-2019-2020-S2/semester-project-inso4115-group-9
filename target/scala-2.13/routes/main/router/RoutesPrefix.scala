// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ale/Documents/Projects/Web Design and Development/Requeriment Project/disaster-app/disaster-app/conf/routes
// @DATE:Sun Mar 29 14:27:13 BOT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
