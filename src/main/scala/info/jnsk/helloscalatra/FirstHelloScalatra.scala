package info.jnsk.helloscalatra

import org.scalatra._

class FirstHelloScalatra extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
