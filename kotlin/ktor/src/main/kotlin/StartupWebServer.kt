import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    StartupWebServer().start()
}

class StartupWebServer(val port: Int = 8080) {
    private var server: ApplicationEngine? = null

    fun start(wait: Boolean = true) {
        server = embeddedServer(Netty, port) {
            routing {
                get("/") {
                    log.info("A request has arrived")
                    val question = call.request.queryParameters["q"]
                    val answer =
                        if (question == null) "team name" else {
                            if (question.matches(Regex(".*what is the sum of (\\d+) and (\\d+)"))) {
                                val (a,b) = Regex(".*what is the sum of (\\d+) and (\\d+)").matchEntire(question)!!.destructured
                                (a.toInt() + b.toInt()).toString()
                            } else "team name"
                        }

                    call.respondText(answer, ContentType.Text.Html)
                }
            }
        }.start(wait)
    }

    fun stop() {
        server?.stop(100,1000)
        server = null
    }
}