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

    @Test
    public void should_face_west_when_execute_command_given_orient_north_and_turn_left() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("L");
        String report = rover.getReport();

        assertEquals("0:0:W", report);
    }
}
