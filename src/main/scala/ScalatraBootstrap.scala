import me.geofbot.lol._
import org.scalatra._
import javax.servlet.ServletContext

import me.geofbot.lol.servlet.RootServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new RootServlet, "/*")
  }
}
