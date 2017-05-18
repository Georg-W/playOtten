
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/georg/Documents/projects/otten/otten/conf/routes
// @DATE:Thu May 18 20:11:49 CEST 2017

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
  HomeController_1: controllers.HomeController,
  // @LINE:14
  WarehouseController_0: controllers.WarehouseController,
  // @LINE:17
  ProductController_2: controllers.ProductController,
  // @LINE:22
  TagController_3: controllers.TagController,
  // @LINE:27
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:14
    WarehouseController_0: controllers.WarehouseController,
    // @LINE:17
    ProductController_2: controllers.ProductController,
    // @LINE:22
    TagController_3: controllers.TagController,
    // @LINE:27
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, WarehouseController_0, ProductController_2, TagController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, WarehouseController_0, ProductController_2, TagController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse""", """controllers.WarehouseController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.ProductController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """controllers.ProductController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.TagController.list()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.TagController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_WarehouseController_create1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse")))
  )
  private[this] lazy val controllers_WarehouseController_create1_invoker = createInvoker(
    WarehouseController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "create",
      Nil,
      "POST",
      """Warehouse""",
      this.prefix + """warehouse"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProductController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_ProductController_list2_invoker = createInvoker(
    ProductController_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "list",
      Nil,
      "GET",
      """Product""",
      this.prefix + """product"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_show3_invoker = createInvoker(
    ProductController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """product/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProductController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_ProductController_create4_invoker = createInvoker(
    ProductController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """product"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TagController_list5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_TagController_list5_invoker = createInvoker(
    TagController_3.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagController",
      "list",
      Nil,
      "GET",
      """Tag""",
      this.prefix + """tag"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_TagController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_TagController_create6_invoker = createInvoker(
    TagController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """tag"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:14
    case controllers_WarehouseController_create1_route(params) =>
      call { 
        controllers_WarehouseController_create1_invoker.call(WarehouseController_0.create())
      }
  
    // @LINE:17
    case controllers_ProductController_list2_route(params) =>
      call { 
        controllers_ProductController_list2_invoker.call(ProductController_2.list())
      }
  
    // @LINE:18
    case controllers_ProductController_show3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_show3_invoker.call(ProductController_2.show(id))
      }
  
    // @LINE:19
    case controllers_ProductController_create4_route(params) =>
      call { 
        controllers_ProductController_create4_invoker.call(ProductController_2.create())
      }
  
    // @LINE:22
    case controllers_TagController_list5_route(params) =>
      call { 
        controllers_TagController_list5_invoker.call(TagController_3.list())
      }
  
    // @LINE:23
    case controllers_TagController_create6_route(params) =>
      call { 
        controllers_TagController_create6_invoker.call(TagController_3.create())
      }
  
    // @LINE:27
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
