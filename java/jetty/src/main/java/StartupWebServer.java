import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartupWebServer {

    // Make sure .../startup_web_servers/java/jetty is your working directory
    public static void main(String[] args) throws Exception {
        Server server = new Server(1337);
        server.setHandler(new WebAppContext("src/main/webapp", "/"));
        server.start();
    }

}
