
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navigation_Scope0 {
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

class navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<div class="nav-item">
    <a href=""""),_display_(/*4.15*/routes/*4.21*/.HomeController.index()),format.raw/*4.44*/(""""><i class="fa fa-building" aria-hidden="true"></i> Warehouse</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.ProductController.list()),format.raw/*7.46*/(""""><i class="fa fa-television" aria-hidden="true"></i> Produkte</a>
</div>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navigation extends navigation_Scope0.navigation
              /*
                  -- GENERATED --
                  DATE: Thu May 18 20:11:49 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/navigation.scala.html
                  HASH: 55653c074dca32aab4c1b0f721d5cef884d36893
                  MATRIX: 748->1|844->3|872->5|935->42|949->48|992->71|1128->181|1142->187|1187->212
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|38->7|38->7|38->7
                  -- GENERATED --
              */
          