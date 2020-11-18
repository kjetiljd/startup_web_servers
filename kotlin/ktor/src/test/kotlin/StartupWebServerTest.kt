import org.junit.AfterClass
import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Test
import java.net.URL
import java.net.URLEncoder
import kotlin.text.Charsets.UTF_8

class StartupWebServerTest {
    companion object {
        private val startupWebServer = StartupWebServer(1337)

        @BeforeClass @JvmStatic
        fun startServer() {
            startupWebServer.start(wait = false)
        }

        @AfterClass @JvmStatic
        fun stopServer() {
            startupWebServer.stop()
        }
    }

    @Test
    fun should_accept_missing_input() {
        assertEquals("team name", answer(null), )
    }

    @Test
    fun should_answer_name() {
        assertEquals("team name", answer("what is your name"))
    }

    @Test
    fun should_add_numbers() {
        assertEquals("16", answer("what is the sum of 4 and 12"))
    }

    fun answer(question:String?): String {
        val q = if (question == null) "" else "?q=" + URLEncoder.encode(question, UTF_8.displayName())
        return URL("http://localhost:1337/$q").readText()
    }

}