import java.util.stream.IntStream;

public class MarsRover {
    private static final String EMPTY = "";
    private static final String REPORT_FORMATTER = "%s:%s";

    private Orientation orientation;

    MarsRover() {
        orientation = new NorthOriented(new Coordinate(0, 0));
    }

    MarsRover(Orientation orientation) {
        this.orientation = orientation;
    }

    public String getReport() {
        return String.format(REPORT_FORMATTER, orientation.getCoordinate().showCoordinate(), orientation.getDirection());
    }

    public void executeCommand(String command) {
        if (command == null || EMPTY.equals(command)) {
            return;
        }
        IntStream.rangeClosed(0, command.length() - 1)
                .mapToObj(i -> command.substring(i, i + 1))
                .forEach(action -> {
                    turnDirection(action);
                    move(action);
                });

    }

    private void move(String command) {
        if ("M".equals(command)) {
            orientation = orientation.moveForward();
        }
        if ("B".equals(command)) {
            orientation = orientation.moveBackward();
        }
    }

    private void turnDirection(String command) {
        if ("L".equals(command)) {
            orientation = orientation.turnLeft();
        }
        if ("R".equals(command)) {
            orientation = orientation.turnRight();
        }
    }
}
