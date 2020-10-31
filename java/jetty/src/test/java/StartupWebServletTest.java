import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StartupWebServletTest {

    private final StartupWebServlet servlet = new StartupWebServlet();

    @Test
    public void should_accept_missing_input() {
        assertEquals(servlet.answer(null), "team name");
    }

    @Test
    public void should_add_numbers() {
        assertEquals(servlet.answer("what is the sum of 14 and 4"), "18");
    }
}
