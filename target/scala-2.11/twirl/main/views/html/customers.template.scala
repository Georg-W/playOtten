
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customers_Scope0 {
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

class customers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerList: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Customer")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Customer</h1>
    """),_display_(/*5.6*/if(customerList.size() > 0)/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="col-xs-12">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>Name</td>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*15.22*/for(customer <- customerList) yield /*15.51*/{_display_(Seq[Any](format.raw/*15.52*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <td>"""),_display_(/*17.34*/customer/*17.42*/.getPrename()),format.raw/*17.55*/("""</td>
                        </tr>

                    """)))}),format.raw/*20.22*/("""
                    """),format.raw/*21.21*/("""</tbody>
                </table>
            </div>

        </div>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
        """),format.raw/*27.9*/("""<div class="customer-item">
            Kein Customer vorhanden
        </div>
    """)))}),format.raw/*30.6*/("""
""")))}))
      }
    }
  }

  def render(customerList:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerList)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerList) => apply(customerList)

  def ref: this.type = this

}


}

/**/
object customers extends customers_Scope0.customers
              /*
                  -- GENERATED --
                  DATE: Fri May 26 11:21:51 CEST 2017
                  SOURCE: C:/Users/Julian/Documents/GitHub/playOtten/app/views/customers.scala.html
                  HASH: 72eeba0083a43ee5e7813cd8f30d4c328bfe81f0
                  MATRIX: 761->1|886->31|916->36|940->52|978->53|1010->59|1059->83|1094->110|1133->112|1169->122|1516->442|1561->471|1600->472|1654->498|1720->537|1737->545|1771->558|1863->619|1913->641|2010->721|2023->726|2062->727|2099->737|2216->824
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|46->15|46->15|46->15|47->16|48->17|48->17|48->17|51->20|52->21|57->26|57->26|57->26|58->27|61->30
                  -- GENERATED --
              */
          