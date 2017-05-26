
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object workers_Scope0 {
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

class workers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Worker],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(workerList: List[Worker]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("Workers")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<h1>Workers</h1>
    """),_display_(/*5.6*/if(workerList.size() > 0)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>Vorname</td>
                            <td>Nachname</td>
                        </tr>

                    </thead>
                    <tbody>
                    """),_display_(/*17.22*/for(worker <- workerList) yield /*17.47*/{_display_(Seq[Any](format.raw/*17.48*/("""
                        """),format.raw/*18.25*/("""<tr>
                            <td>"""),_display_(/*19.34*/worker/*19.40*/.getPrename()),format.raw/*19.53*/("""</td>
                            <td>"""),_display_(/*20.34*/worker/*20.40*/.getLastname()),format.raw/*20.54*/("""</td>
                        </tr>
                    """)))}),format.raw/*22.22*/("""
                    """),format.raw/*23.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*28.7*/else/*28.12*/{_display_(Seq[Any](format.raw/*28.13*/("""
        """),format.raw/*29.9*/("""<div class="project-item">
            Kein Worker vorhanden
        </div>
    """)))}),format.raw/*32.6*/("""
    """),format.raw/*33.5*/("""<div class="row add-item">
        <div class="col-xs-2">
            <a href=""""),_display_(/*35.23*/routes/*35.29*/.FormController.addWorker()),format.raw/*35.56*/("""" class="btn btn-success"><i class="fa fa-plus-square fa-2x" aria-hidden="true"></i></a>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(workerList:List[Worker]): play.twirl.api.HtmlFormat.Appendable = apply(workerList)

  def f:((List[Worker]) => play.twirl.api.HtmlFormat.Appendable) = (workerList) => apply(workerList)

  def ref: this.type = this

}


}

/**/
object workers extends workers_Scope0.workers
              /*
                  -- GENERATED --
                  DATE: Fri May 26 14:02:00 CEST 2017
                  SOURCE: C:/Users/Julian/Documents/GitHub/playOtten/app/views/workers.scala.html
                  HASH: 1748a3f45d5a8c6a5c32dc0373ed04a09d9e6e36
                  MATRIX: 755->1|876->27|906->32|929->47|967->48|999->54|1047->77|1080->102|1119->104|1155->114|1554->486|1595->511|1634->512|1688->538|1754->577|1769->583|1803->596|1870->636|1885->642|1920->656|2010->715|2060->737|2157->817|2170->822|2209->823|2246->833|2360->917|2393->923|2502->1005|2517->1011|2565->1038
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23|59->28|59->28|59->28|60->29|63->32|64->33|66->35|66->35|66->35
                  -- GENERATED --
              */
          