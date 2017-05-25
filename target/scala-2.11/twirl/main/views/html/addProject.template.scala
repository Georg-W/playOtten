
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProject_Scope0 {
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

class addProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[Project],List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: play.data.Form[Project], customerList: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main("Project")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Project</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjectsController.create(), 'enctype -> "multipart/form-data")/*12.101*/{_display_(Seq[Any](format.raw/*12.102*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(projectForm("name"), 'id -> "name", '_label -> "name", 'class -> "form-control")),format.raw/*13.111*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(projectForm("duration"), '_label -> "duration", 'class -> "form-control",  'type -> "number")),format.raw/*14.124*/("""
            """),_display_(/*15.14*/helper/*15.20*/.select(
                field = projectForm("TmpCustomer"),
                options = (customerList.map(customer => customer.getId().toString() -> customer.getPrename())),
                'id -> "customer",
                '_label -> "customer",
                'class -> "form-control")),format.raw/*20.42*/("""
            """),format.raw/*21.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Add </button>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(projectForm:play.data.Form[Project],customerList:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,customerList)

  def f:((play.data.Form[Project],List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,customerList) => apply(projectForm,customerList)

  def ref: this.type = this

}


}

/**/
object addProject extends addProject_Scope0.addProject
              /*
                  -- GENERATED --
                  DATE: Thu May 25 16:28:56 CEST 2017
                  SOURCE: C:/Users/georg/Documents/projects/otten/otten/app/views/addProject.scala.html
                  HASH: 002970f9726e21100664ec6cd34aa06decd85f69
                  MATRIX: 787->1|950->69|980->74|1003->89|1041->90|1073->96|1277->273|1292->279|1387->364|1427->365|1469->380|1484->386|1597->477|1639->492|1654->498|1780->602|1822->617|1837->623|2151->916|2193->930|2384->1090|2421->1100
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|51->20|52->21|53->22|54->23
                  -- GENERATED --
              */
          