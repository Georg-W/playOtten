
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object otten_Scope0 {
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

class otten extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Otte],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ottenList: List[Otte]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Otten")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Otten</h1>
    """),_display_(/*5.6*/if(ottenList.size() > 0)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>Vorname</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*15.22*/for(otte <- ottenList) yield /*15.44*/{_display_(Seq[Any](format.raw/*15.45*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <td>"""),_display_(/*17.34*/otte/*17.38*/.getName()),format.raw/*17.48*/("""</td>
                        </tr>
                    """)))}),format.raw/*19.22*/("""
                    """),format.raw/*20.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*25.7*/else/*25.12*/{_display_(Seq[Any](format.raw/*25.13*/("""
        """),format.raw/*26.9*/("""<div class="otten-item">
            Kein Otte vorhanden
        </div>
    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(ottenList:List[Otte]): play.twirl.api.HtmlFormat.Appendable = apply(ottenList)

  def f:((List[Otte]) => play.twirl.api.HtmlFormat.Appendable) = (ottenList) => apply(ottenList)

  def ref: this.type = this

}


}

/**/
object otten extends otten_Scope0.otten
              /*
                  -- GENERATED --
                  DATE: Thu May 25 15:29:51 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/otten.scala.html
                  HASH: 2b2ea5073b6514c112617b3d445f41bce03076ea
                  MATRIX: 749->1|867->24|897->29|918->42|956->43|988->49|1034->70|1066->94|1105->96|1141->106|1491->429|1529->451|1568->452|1622->478|1688->517|1701->521|1732->531|1822->590|1872->612|1969->692|1982->697|2021->698|2058->708|2168->788
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|46->15|46->15|46->15|47->16|48->17|48->17|48->17|50->19|51->20|56->25|56->25|56->25|57->26|60->29
                  -- GENERATED --
              */
          