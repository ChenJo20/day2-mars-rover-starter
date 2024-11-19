public class MarsRover {
    private Direction direct;

    MarsRover() {
        direct = Direction.N;
    }

    MarsRover(Direction direct) {
        this.direct = direct;
    }

    public String getReport() {
        return "0:0:" + direct;
    }

    public void executeCommand(String command) {
        if ("L".equals(command)) {
            if (direct.equals(Direction.N)) {
                direct = Direction.W;
                return;
            }
            if (direct.equals(Direction.W)) {
                direct = Direction.S;
                return;
            }
            if (direct.equals(Direction.S)) {
                direct = Direction.E;
                return;
            }
            if (direct.equals(Direction.E)) {
                direct = Direction.N;
                return;
            }
        }
        if ("R".equals(command)) {
            if (direct.equals(Direction.N)) {
                direct = Direction.E;
                return;
            }
            if (direct.equals(Direction.E)) {
                direct = Direction.S;
                return;
            }
            if (direct.equals(Direction.S)) {
                direct = Direction.W;
                return;
            }
            if (direct.equals(Direction.W)) {
                direct = Direction.N;
                return;
            }
        }
        return;
    }
}
