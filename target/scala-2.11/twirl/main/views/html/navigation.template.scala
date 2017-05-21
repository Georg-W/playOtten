
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
    <a href=""""),_display_(/*4.15*/routes/*4.21*/.HomeController.index()),format.raw/*4.44*/(""""><i class="fa fa-building" aria-hidden="true"></i>Home</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.ProjectsController.index()),format.raw/*7.48*/(""""><i class="fa fa-building" aria-hidden="true"></i>Projects</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.WorkersController.index()),format.raw/*10.47*/(""""><i class="fa fa-building" aria-hidden="true"></i>Workers</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*13.15*/routes/*13.21*/.OttenController.index()),format.raw/*13.45*/(""""><i class="fa fa-building" aria-hidden="true"></i>Otten</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*16.15*/routes/*16.21*/.CustomersController.index()),format.raw/*16.49*/(""""><i class="fa fa-building" aria-hidden="true"></i>Customers</a>
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
                  DATE: Sun May 21 20:56:35 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/navigation.scala.html
                  HASH: d2ae66d96f843ac36cbda3cf32cfc34aa4b1517f
                  MATRIX: 748->1|844->3|872->5|935->42|949->48|992->71|1122->175|1136->181|1183->208|1318->316|1333->322|1380->348|1514->455|1529->461|1574->485|1706->590|1721->596|1770->624
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|38->7|38->7|38->7|41->10|41->10|41->10|44->13|44->13|44->13|47->16|47->16|47->16
                  -- GENERATED --
              */
          