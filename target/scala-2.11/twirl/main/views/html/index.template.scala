
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectList: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

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

  def render(projectList:List[Project]): play.twirl.api.HtmlFormat.Appendable = apply(projectList)

  def f:((List[Project]) => play.twirl.api.HtmlFormat.Appendable) = (projectList) => apply(projectList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 25 13:18:21 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/index.scala.html
                  HASH: 468824f5d6b3f7d56800619552310443c65395a7
                  MATRIX: 752->1|875->29|903->32|923->44|962->46|991->49|1033->66|1067->92|1106->94|1138->100|1391->326|1434->353|1473->354|1514->367|1610->432|1649->443|1721->498|1733->502|1772->503|1804->508|1904->578|1936->580
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|38->7|47->16|47->16|47->16|48->17|52->21|53->22|58->27|58->27|58->27|59->28|62->31|63->32
                  -- GENERATED --
              */
          