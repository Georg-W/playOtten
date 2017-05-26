
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Julian/Documents/GitHub/playOtten/conf/routes
// @DATE:Fri May 26 13:42:43 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
