
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

class customers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Customers")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
    """),format.raw/*2.5*/("""<h1>Customers</h1>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object customers extends customers_Scope0.customers
              /*
                  -- GENERATED --
                  DATE: Sun May 21 19:07:48 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/customers.scala.html
                  HASH: c5575bd4ac3a608259445bf322ebfb1dba684c71
                  MATRIX: 835->1|860->18|898->19|930->25
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          