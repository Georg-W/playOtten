
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
    <a href=""""),_display_(/*4.15*/routes/*4.21*/.HomeController.index()),format.raw/*4.44*/("""">Home</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.ProjectsController.index()),format.raw/*7.48*/("""">Projects</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.WorkersController.index()),format.raw/*10.47*/("""">Workers</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*13.15*/routes/*13.21*/.OttenController.index()),format.raw/*13.45*/("""">Otten</a>
</div>
<div class="nav-item">
    <a href=""""),_display_(/*16.15*/routes/*16.21*/.CustomersController.index()),format.raw/*16.49*/("""">Customers</a>
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
                  DATE: Thu May 25 11:02:53 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/navigation.scala.html
                  HASH: 3c79f5c92703bbe93a500c968359c2fbf991c280
                  MATRIX: 748->1|844->3|872->5|935->42|949->48|992->71|1073->126|1087->132|1134->159|1220->218|1235->224|1282->250|1367->308|1382->314|1427->338|1510->394|1525->400|1574->428
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|38->7|38->7|38->7|41->10|41->10|41->10|44->13|44->13|44->13|47->16|47->16|47->16
                  -- GENERATED --
              */
          