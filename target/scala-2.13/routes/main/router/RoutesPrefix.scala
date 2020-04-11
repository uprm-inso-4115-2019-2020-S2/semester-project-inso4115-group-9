// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/etorr/IdeaProjects/semester-project-inso4115-group-9/conf/routes
// @DATE:Fri Apr 10 18:26:30 BOT 2020


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
