
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/georg/Documents/projects/otten/otten/conf/routes
// @DATE:Sun May 21 19:11:25 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  FormController_4: controllers.FormController,
  // @LINE:7
  ProjectsController_6: controllers.ProjectsController,
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:9
  OttenController_3: controllers.OttenController,
  // @LINE:10
  WorkersController_2: controllers.WorkersController,
  // @LINE:11
  CustomersController_0: controllers.CustomersController,
  // @LINE:15
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    FormController_4: controllers.FormController,
    // @LINE:7
    ProjectsController_6: controllers.ProjectsController,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:9
    OttenController_3: controllers.OttenController,
    // @LINE:10
    WorkersController_2: controllers.WorkersController,
    // @LINE:11
    CustomersController_0: controllers.CustomersController,
    // @LINE:15
    Assets_5: controllers.Assets
  ) = this(errorHandler, FormController_4, ProjectsController_6, HomeController_1, OttenController_3, WorkersController_2, CustomersController_0, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FormController_4, ProjectsController_6, HomeController_1, OttenController_3, WorkersController_2, CustomersController_0, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FormController.loginUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectsController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """otten""", """controllers.OttenController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workers""", """controllers.WorkersController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.CustomersController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_FormController_loginUser0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_FormController_loginUser0_invoker = createInvoker(
    FormController_4.loginUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "loginUser",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProjectsController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectsController_index1_invoker = createInvoker(
    ProjectsController_6.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """projects"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_index2_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_OttenController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("otten")))
  )
  private[this] lazy val controllers_OttenController_index3_invoker = createInvoker(
    OttenController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OttenController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """otten"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_WorkersController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workers")))
  )
  private[this] lazy val controllers_WorkersController_index4_invoker = createInvoker(
    WorkersController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkersController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """workers"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CustomersController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_CustomersController_index5_invoker = createInvoker(
    CustomersController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomersController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """customers"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_FormController_loginUser0_route(params) =>
      call { 
        controllers_FormController_loginUser0_invoker.call(FormController_4.loginUser())
      }
  
    // @LINE:7
    case controllers_ProjectsController_index1_route(params) =>
      call { 
        controllers_ProjectsController_index1_invoker.call(ProjectsController_6.index())
      }
  
    // @LINE:8
    case controllers_HomeController_index2_route(params) =>
      call { 
        controllers_HomeController_index2_invoker.call(HomeController_1.index())
      }
  
    // @LINE:9
    case controllers_OttenController_index3_route(params) =>
      call { 
        controllers_OttenController_index3_invoker.call(OttenController_3.index())
      }
  
    // @LINE:10
    case controllers_WorkersController_index4_route(params) =>
      call { 
        controllers_WorkersController_index4_invoker.call(WorkersController_2.index())
      }
  
    // @LINE:11
    case controllers_CustomersController_index5_route(params) =>
      call { 
        controllers_CustomersController_index5_invoker.call(CustomersController_0.index())
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
