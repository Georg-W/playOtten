
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Login</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.UserController.create(), 'enctype -> "multipart/form-data")/*12.97*/{_display_(Seq[Any](format.raw/*12.98*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(loginForm("email"), 'id -> "name", '_label -> "Email", 'class -> "form-control")),format.raw/*13.111*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(loginForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*14.102*/("""
            """),format.raw/*15.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Einloggen </button>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(loginForm:play.data.Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((play.data.Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu May 25 11:24:10 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/login.scala.html
                  HASH: 0a9d70b89b199f911ab8b99be2ae9222e4ee9b66
                  MATRIX: 759->1|887->34|917->39|938->52|976->53|1008->59|1210->234|1225->240|1315->321|1354->322|1396->337|1411->343|1524->434|1566->449|1581->455|1685->537|1727->551|1924->717|1961->727
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|48->17
                  -- GENERATED --
              */
          