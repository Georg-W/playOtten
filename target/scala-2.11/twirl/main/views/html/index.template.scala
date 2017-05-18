
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Warehouse],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(warehouseList: List[Warehouse]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("lager")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
  """),format.raw/*4.3*/("""<h1>heyy</h1>
  """),_display_(/*5.4*/if(warehouseList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
    """),_display_(/*6.6*/for(warehouse <- warehouseList) yield /*6.37*/ {_display_(Seq[Any](format.raw/*6.39*/("""
      """),format.raw/*7.7*/("""<div class="warehouse-item">
      """),_display_(/*8.8*/warehouse),format.raw/*8.17*/("""
      """),format.raw/*9.7*/("""</div>
    """)))}),format.raw/*10.6*/("""
  """)))}/*11.5*/else/*11.9*/{_display_(Seq[Any](format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""<div class="warehouse-item">
      Kein Warehouse vorhanden
    </div>
  """)))}),format.raw/*15.4*/("""

  """),format.raw/*17.3*/("""<div class="new-holder">
    <a class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Lagerhaus anlegen</a>
  </div>


""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(warehouseList:List[Warehouse]): play.twirl.api.HtmlFormat.Appendable = apply(warehouseList)

  def f:((List[Warehouse]) => play.twirl.api.HtmlFormat.Appendable) = (warehouseList) => apply(warehouseList)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 18 20:14:39 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/index.scala.html
                  HASH: bea526361b41edb1cb0074d5cc60a722c99506fd
                  MATRIX: 754->1|881->33|909->36|930->49|969->51|998->54|1040->71|1076->99|1115->101|1146->107|1192->138|1231->140|1264->147|1325->183|1354->192|1387->199|1429->211|1451->216|1463->220|1502->221|1534->226|1638->300|1669->304|1850->455
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|42->11|42->11|42->11|43->12|46->15|48->17|53->22
                  -- GENERATED --
              */
          