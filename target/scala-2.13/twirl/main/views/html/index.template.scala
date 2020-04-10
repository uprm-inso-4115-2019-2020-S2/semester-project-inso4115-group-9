
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Disaster Aid App with Play Framework!</h1>

<div>
  <ul>
    <li>Register: <a href=""""),_display_(/*8.29*/routes/*8.35*/.Register.listUsers),format.raw/*8.54*/("""">"""),_display_(/*8.57*/routes/*8.63*/.Register.listUsers),format.raw/*8.82*/("""</a></li>
    <li>Login: <a href=""""),_display_(/*9.26*/routes/*9.32*/.Register.goToLogin),format.raw/*9.51*/("""">"""),_display_(/*9.54*/routes/*9.60*/.Register.goToLogin),format.raw/*9.79*/("""</a> </li>
  </ul>
</div>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T11:31:15.407
                  SOURCE: C:/Users/etorr/IdeaProjects/semester-project-inso4115-group-9/app/views/index.scala.html
                  HASH: bc284dc0223188bc55a4cc2ebe1ef542eac6215e
                  MATRIX: 722->1|818->3|848->8|879->31|918->33|948->37|1078->141|1092->147|1131->166|1160->169|1174->175|1213->194|1275->230|1289->236|1328->255|1357->258|1371->264|1410->283|1470->313
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|33->8|33->8|33->8|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|34->9|37->12
                  -- GENERATED --
              */
          