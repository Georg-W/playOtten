
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projects_Scope0 {
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

class projects extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectList: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Projects")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Projects</h1>
    """),_display_(/*5.6*/if(projectList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>Name</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*15.22*/for(project <- projectList) yield /*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <td>"""),_display_(/*17.34*/project/*17.41*/.getName()),format.raw/*17.51*/("""</td>
                        </tr>

                    """)))}),format.raw/*20.22*/("""
                    """),format.raw/*21.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
        """),format.raw/*27.9*/("""<div class="project-item">
            Kein Project vorhanden
        </div>
    """)))}),format.raw/*30.6*/("""
""")))}))
      }
    }
  }

  def render(projectList:List[Project]): play.twirl.api.HtmlFormat.Appendable = apply(projectList)

  def f:((List[Project]) => play.twirl.api.HtmlFormat.Appendable) = (projectList) => apply(projectList)

  def ref: this.type = this

}


}

/**/
object projects extends projects_Scope0.projects
              /*
                  -- GENERATED --
                  DATE: Thu May 25 15:07:41 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/projects.scala.html
                  HASH: 964718e62fcbadc02b605b67e9ef83e53f9cfbc1
                  MATRIX: 758->1|881->29|911->34|935->50|973->51|1005->57|1054->81|1088->107|1127->109|1163->119|1510->439|1553->466|1592->467|1646->493|1712->532|1728->539|1759->549|1851->610|1901->632|1998->712|2011->717|2050->718|2087->728|2202->813
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|46->15|46->15|46->15|47->16|48->17|48->17|48->17|51->20|52->21|57->26|57->26|57->26|58->27|61->30
                  -- GENERATED --
              */
          