
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*16.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*17.118*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.101*/("""">
    </head>
    <body>
        """),format.raw/*22.31*/("""
        """),format.raw/*23.9*/("""<div class="container-fluid">

                    <div class="row header">
                        <div class="col-xs-12">
                        """),_display_(/*27.26*/header()),format.raw/*27.34*/("""
                        """),format.raw/*28.25*/("""</div>

            </div>

                    <div class="row">
                        <div class="col-sm-3 navigation">
                        """),_display_(/*34.26*/navigation()),format.raw/*34.38*/("""
                        """),format.raw/*35.25*/("""</div>
                        <div class="col-sm-9 content">
                        """),_display_(/*37.26*/content),format.raw/*37.33*/("""
                        """),format.raw/*38.25*/("""</div>

            </div>

                    <div class="row footer">
                        <div class="col-xs-12">
                        """),_display_(/*44.26*/footer()),format.raw/*44.34*/("""
                        """),format.raw/*45.25*/("""</div>
                    </div>

        </div>

        <script type='text/javascript' src='"""),_display_(/*50.46*/routes/*50.52*/.Assets.versioned("lib/jquery/jquery.min.js")),format.raw/*50.97*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*51.46*/routes/*51.52*/.Assets.versioned("lib/bootstrap/js/bootstrap.js")),format.raw/*51.102*/("""'></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("javascripts/main.js")),format.raw/*52.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu May 18 20:11:49 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/main.scala.html
                  HASH: 4bed029e2d10d411fd1b6c07927a288c7bc3a5bd
                  MATRIX: 997->255|1122->285|1150->287|1230->392|1266->401|1301->409|1327->414|1422->482|1437->488|1498->527|1566->568|1581->574|1654->626|1737->682|1752->688|1832->746|1915->802|1930->808|1993->849|2055->972|2091->981|2267->1130|2296->1138|2349->1163|2525->1312|2558->1324|2611->1349|2725->1436|2753->1443|2806->1468|2979->1614|3008->1622|3061->1647|3184->1743|3199->1749|3265->1794|3349->1851|3364->1857|3436->1907|3497->1941|3512->1947|3573->1987
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|51->22|52->23|56->27|56->27|57->28|63->34|63->34|64->35|66->37|66->37|67->38|73->44|73->44|74->45|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52
                  -- GENERATED --
              */
          