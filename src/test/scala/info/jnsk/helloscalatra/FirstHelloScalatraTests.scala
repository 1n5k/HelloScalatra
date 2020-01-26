package info.jnsk.helloscalatra

import org.scalatra.test.scalatest._

class FirstHelloScalatraTests extends ScalatraFunSuite {

  addServlet(classOf[FirstHelloScalatra], "/*")

  test("GET / on FirstHelloScalatra should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
