public class MarsRover {
    private Orientation orientation;
    private Direction direct;
    private int xPos;
    private int yPos;

    MarsRover() {
        direct = Direction.N;
        orientation = new NorthOriented();
    }

    MarsRover(Orientation orientation) {
        this.orientation = orientation;
    }

    public String getReport() {
        return String.format("%d:%d:%s", xPos, yPos, orientation.getDirection());
    }

    public void executeCommand(String command) {
        if ("L".equals(command)) {
            orientation = orientation.turnLeft();
        }
        if ("R".equals(command)) {
            orientation = orientation.turnRight();
        }
        if ("M".equals(command)) {
            if (Direction.N.equals(orientation.getDirection())) {
                yPos++;
            }

        }
        return;
    }
}
