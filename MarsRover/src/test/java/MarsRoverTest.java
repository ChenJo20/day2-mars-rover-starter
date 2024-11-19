import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsRoverTest {
    @Test
    public void should_not_null_when_init_mars_rover() {
        MarsRover rover = new MarsRover();
        assertNotNull(rover);
    }

    @Test
    public void should_return_report_when_get_report() {
        MarsRover rover = new MarsRover();

        String report = rover.getReport();

        assertEquals("0:0:N", report);
    }
}
