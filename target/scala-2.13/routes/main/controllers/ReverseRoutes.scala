// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/etorr/IdeaProjects/semester-project-inso4115-group-9/conf/routes
// @DATE:Fri Apr 10 18:26:30 BOT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:12
  class ReverseRegister(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def goToLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def goToRegister(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:13
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:20
  class ReverseUser(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user")
    }
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(): Call = {
    
      () match {
      
        // @LINE:9
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}
