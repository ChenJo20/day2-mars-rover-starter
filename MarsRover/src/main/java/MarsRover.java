public class MarsRover {
    private static final String EMPTY = "";
    private Orientation orientation;
    private int xPos;
    private int yPos;

    MarsRover() {
        orientation = new NorthOriented();
    }

    MarsRover(Orientation orientation) {
        this.orientation = orientation;
    }

    public String getReport() {
        return String.format("%d:%d:%s", xPos, yPos, orientation.getDirection());
    }

    public void executeCommand(String command) {
        if (command == null || EMPTY.equals(command)) {
            return;
        }
        turnDirection(command);
        move(command);
    }

    private void move(String command) {
        if ("M".equals(command)) {
            moveForward(orientation);
        }
        if ("B".equals(command)) {
            moveBackward(orientation);
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

    private void moveForward(Orientation orientation) {
        if (Direction.N.equals(orientation.getDirection())) {
            yPos++;
        }
        if (Direction.E.equals(orientation.getDirection())) {
            xPos++;
        }
        if (Direction.S.equals(orientation.getDirection())) {
            yPos--;
        }
        if (Direction.W.equals(orientation.getDirection())) {
            xPos--;
        }
    }

    private void moveBackward(Orientation orientation) {
        if (Direction.N.equals(orientation.getDirection())) {
            yPos--;
        }
        if (Direction.E.equals(orientation.getDirection())) {
            xPos--;
        }
        if (Direction.S.equals(orientation.getDirection())) {
            yPos++;
        }
        if (Direction.W.equals(orientation.getDirection())) {
            xPos++;
        }
    }
}
