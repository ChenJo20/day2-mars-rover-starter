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

    @Test
    public void should_face_south_when_execute_command_given_orient_west_and_turn_left() {
        MarsRover rover = new MarsRover(new WestOriented());

        rover.executeCommand("L");
        String report = rover.getReport();

        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_east_when_execute_command_given_orient_south_and_turn_left() {
        MarsRover rover = new MarsRover(new SouthOriented());

        rover.executeCommand("L");
        String report = rover.getReport();

        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_north_when_execute_command_given_orient_east_and_turn_left() {
        MarsRover rover = new MarsRover(new EastOriented());

        rover.executeCommand("L");
        String report = rover.getReport();

        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_east_when_execute_command_given_orient_north_and_turn_right() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("R");
        String report = rover.getReport();

        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_south_when_execute_command_given_orient_east_and_turn_right() {
        MarsRover rover = new MarsRover(new EastOriented());

        rover.executeCommand("R");
        String report = rover.getReport();

        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_west_when_execute_command_given_orient_south_and_turn_right() {
        MarsRover rover = new MarsRover(new SouthOriented());

        rover.executeCommand("R");
        String report = rover.getReport();

        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_north_when_execute_command_given_orient_west_and_turn_right() {
        MarsRover rover = new MarsRover(new WestOriented());

        rover.executeCommand("R");
        String report = rover.getReport();

        assertEquals("0:0:N", report);
    }

    @Test
    public void should_return_0_1_N_when_execute_command_given_orient_north_and_move_forward() {
        MarsRover rover = new MarsRover();

        rover.executeCommand("M");
        String report = rover.getReport();

        assertEquals("0:1:N", report);
    }
}
