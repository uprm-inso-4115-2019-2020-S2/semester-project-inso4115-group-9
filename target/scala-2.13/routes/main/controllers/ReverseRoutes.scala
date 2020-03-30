// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Ale/Documents/Projects/Web Design and Development/Requeriment Project/disaster-app/disaster-app/conf/routes
// @DATE:Sun Mar 29 14:27:13 BOT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseUser(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
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
      
      Call("GET", _prefix)
    }
  
  }


}
