
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object product_Scope0 {
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

class product extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productList: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Produkte")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Produkte</h1>
    """),_display_(/*5.6*/if(productList.size() > 0)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
        """),_display_(/*6.10*/for(product <- productList) yield /*6.37*/ {_display_(Seq[Any](format.raw/*6.39*/("""
            """),format.raw/*7.13*/("""<div class="warehouse-item">
            """),_display_(/*8.14*/product),format.raw/*8.21*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
    """)))}/*11.7*/else/*11.11*/{_display_(Seq[Any](format.raw/*11.12*/("""
        """),format.raw/*12.9*/("""<div class="warehouse-item">
            Kein Produkt vorhanden
        </div>
    """)))}),format.raw/*15.6*/("""

    """),format.raw/*17.5*/("""<div class="new-holder">
        <a class="btn btn-success"><i class="fa fa-plus-square-o" aria-hidden="true"></i> Neues Produkt anlegen</a>
    </div>

""")))}))
      }
    }
  }

  def render(productList:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productList)

  def f:((List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productList) => apply(productList)

  def ref: this.type = this

}


}

/**/
object product extends product_Scope0.product
              /*
                  -- GENERATED --
                  DATE: Thu May 18 20:11:49 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/product.scala.html
                  HASH: 69387a5d29547f1ebb6b7a1a99559b72e7a76502
                  MATRIX: 756->1|879->29|907->32|931->48|969->49|1000->54|1048->77|1082->103|1121->105|1157->115|1199->142|1238->144|1278->157|1346->199|1373->206|1413->219|1460->235|1484->242|1497->246|1536->247|1572->256|1686->340|1719->346
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|39->8|40->9|41->10|42->11|42->11|42->11|43->12|46->15|48->17
                  -- GENERATED --
              */
          