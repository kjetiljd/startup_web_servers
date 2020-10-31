import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class StartupWebServletSpec extends Spec with ShouldMatchers {

  describe("startup web server") {
    val servlet = new StartupWebServlet
    it("adds numbers") {
      servlet.answer("what is the sum of 4 and 12") should equal ("16")
    }
    it("answers Christmas-theme questions") {
      servlet.answer("what's santa clause's real name") should equal ("Kris Kringle")
    }
    it("has a test in need of repair - please fix") {
      servlet.answer("what is the sum of 2 and 2") should equal ("3.99")
    }
  }
}
