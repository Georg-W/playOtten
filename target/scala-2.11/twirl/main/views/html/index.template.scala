
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Project],List[Worker],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectList: List[Project], workerList: List[Worker]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<h1>Home</h1>
  """),_display_(/*5.4*/if(projectList.size() > 0)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

    """),format.raw/*7.5*/("""<div class="row">
      <div class="col-xs-12">
        <table class="table table-hover">
          <thead>
            <tr>
              <td>Bezeichnung</td>
            </tr>
          </thead>
          <tbody>
          """),_display_(/*16.12*/for(project <- projectList) yield /*16.39*/{_display_(Seq[Any](format.raw/*16.40*/("""
            """),format.raw/*17.13*/("""<tr>
                <td>heyy</td>
            </tr>

          """)))}),format.raw/*21.12*/("""
          """),format.raw/*22.11*/("""</tbody>
        </table>
      </div>

    </div>
  """)))}/*27.5*/else/*27.9*/{_display_(Seq[Any](format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""<div class="project-item">
      Kein Project vorhanden
    </div>
  """)))}),format.raw/*31.4*/("""
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(projectList:List[Project],workerList:List[Worker]): play.twirl.api.HtmlFormat.Appendable = apply(projectList,workerList)

  def f:((List[Project],List[Worker]) => play.twirl.api.HtmlFormat.Appendable) = (projectList,workerList) => apply(projectList,workerList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri May 26 11:21:51 CEST 2017
                  SOURCE: C:/Users/Julian/Documents/GitHub/playOtten/app/views/index.scala.html
                  HASH: 0797c29839ccce403b23635277fbf41a46da1394
                  MATRIX: 765->1|914->55|944->60|964->72|1003->74|1033->78|1076->96|1110->122|1149->124|1183->132|1445->367|1488->394|1527->395|1569->409|1669->478|1709->490|1786->550|1798->554|1837->555|1870->561|1973->634|2006->637
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|47->16|47->16|47->16|48->17|52->21|53->22|58->27|58->27|58->27|59->28|62->31|63->32
                  -- GENERATED --
              */
          