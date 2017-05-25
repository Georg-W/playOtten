
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
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*15.22*/for(worker <- workerList) yield /*15.47*/{_display_(Seq[Any](format.raw/*15.48*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <td>"""),_display_(/*17.34*/worker/*17.40*/.getPrename()),format.raw/*17.53*/("""</td>
                        </tr>
                    """)))}),format.raw/*19.22*/("""
                    """),format.raw/*20.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*25.7*/else/*25.12*/{_display_(Seq[Any](format.raw/*25.13*/("""
        """),format.raw/*26.9*/("""<div class="project-item">
            Kein Worker vorhanden
        </div>
    """)))}),format.raw/*29.6*/("""
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
                  DATE: Thu May 25 15:15:30 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/workers.scala.html
                  HASH: 1c47d9f6d19584ea60bbe928b616f4d6ed7d406f
                  MATRIX: 755->1|876->27|906->32|929->47|967->48|999->54|1047->77|1080->102|1119->104|1155->114|1505->437|1546->462|1585->463|1639->489|1705->528|1720->534|1754->547|1844->606|1894->628|1991->708|2004->713|2043->714|2080->724|2194->808
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|46->15|46->15|46->15|47->16|48->17|48->17|48->17|50->19|51->20|56->25|56->25|56->25|57->26|60->29
                  -- GENERATED --
              */
          