public class MarsRover {
    private Orientation orientation;
    private Direction direct;

    MarsRover() {
        direct = Direction.N;
        orientation = new NorthOriented();
    }

    MarsRover(Orientation orientation) {
        this.orientation = orientation;
    }

    public String getReport() {
        return "0:0:" + orientation.getDirection();
    }

    public void executeCommand(String command) {
        if ("L".equals(command)) {
            orientation = orientation.turnLeft();
        }
        if ("R".equals(command)) {
            orientation = orientation.turnRight();
        }
        return;
    }
}
