
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addWorker_Scope0 {
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

class addWorker extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Worker],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workerForm: play.data.Form[Worker]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Worker")/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Worker</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.WorkersController.create(), 'enctype -> "multipart/form-data")/*12.100*/{_display_(Seq[Any](format.raw/*12.101*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(workerForm("prename"), 'id -> "name", '_label -> "Prename", 'class -> "form-control")),format.raw/*13.116*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(workerForm("lastname"), '_label -> "Lastname", 'class -> "form-control")),format.raw/*14.103*/("""

            """),format.raw/*16.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Add </button>
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(workerForm:play.data.Form[Worker]): play.twirl.api.HtmlFormat.Appendable = apply(workerForm)

  def f:((play.data.Form[Worker]) => play.twirl.api.HtmlFormat.Appendable) = (workerForm) => apply(workerForm)

  def ref: this.type = this

}


}

/**/
object addWorker extends addWorker_Scope0.addWorker
              /*
                  -- GENERATED --
                  DATE: Fri May 26 13:42:43 CEST 2017
                  SOURCE: C:/Users/Julian/Documents/GitHub/playOtten/app/views/addWorker.scala.html
                  HASH: 69912e8e4ce273d222ec77ec7960be7ada467a32
                  MATRIX: 769->1|900->37|930->42|952->56|990->57|1022->63|1225->239|1240->245|1334->329|1374->330|1416->345|1431->351|1549->447|1591->462|1606->468|1711->551|1755->567|1946->727|1983->737
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|48->17|49->18
                  -- GENERATED --
              */
          