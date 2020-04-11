// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/etorr/IdeaProjects/semester-project-inso4115-group-9/conf/routes
// @DATE:Fri Apr 10 18:26:30 BOT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Application_1: controllers.Application,
  // @LINE:12
  Register_3: controllers.Register,
  // @LINE:20
  User_0: controllers.User,
  // @LINE:23
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Application_1: controllers.Application,
    // @LINE:12
    Register_3: controllers.Register,
    // @LINE:20
    User_0: controllers.User,
    // @LINE:23
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_1, Register_3, User_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Register_3, User_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Register.goToRegister"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Register.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Register.goToLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """controllers.User.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home Page""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Register_goToRegister1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Register_goToRegister1_invoker = createInvoker(
    Register_3.goToRegister,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Register",
      "goToRegister",
      Nil,
      "GET",
      this.prefix + """register""",
      """ Register""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Register_createUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Register_createUser2_invoker = createInvoker(
    Register_3.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Register",
      "createUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Register_goToLogin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Register_goToLogin3_invoker = createInvoker(
    Register_3.goToLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Register",
      "goToLogin",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_index4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_index4_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_User_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val controllers_User_index5_invoker = createInvoker(
    User_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "index",
      Nil,
      "GET",
      this.prefix + """api/user""",
      """ User Routes""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:12
    case controllers_Register_goToRegister1_route(params@_) =>
      call { 
        controllers_Register_goToRegister1_invoker.call(Register_3.goToRegister)
      }
  
    // @LINE:13
    case controllers_Register_createUser2_route(params@_) =>
      call { 
        controllers_Register_createUser2_invoker.call(Register_3.createUser)
      }
  
    // @LINE:16
    case controllers_Register_goToLogin3_route(params@_) =>
      call { 
        controllers_Register_goToLogin3_invoker.call(Register_3.goToLogin)
      }
  
    // @LINE:17
    case controllers_Application_index4_route(params@_) =>
      call { 
        controllers_Application_index4_invoker.call(Application_1.index)
      }
  
    // @LINE:20
    case controllers_User_index5_route(params@_) =>
      call { 
        controllers_User_index5_invoker.call(User_0.index)
      }
  
    // @LINE:23
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
