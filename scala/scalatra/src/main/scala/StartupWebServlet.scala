import org.scalatra.ScalatraServlet


class StartupWebServlet extends ScalatraServlet {

    get("/") {
        "The server is running"
    }

}
