public class MarsRover {

    private String direction;

    MarsRover() {
        direction = "N";
    }

    MarsRover(String direction) {
        this.direction = direction;
    }

    public String getReport() {
        return "0:0:" + direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if ("L".equals(command)) {
            if (direction.equals("N")) {
                direction = "W";
                return;
            }
            if (direction.equals("W")) {
                direction = "S";
                return;
            }
            if (direction.equals("S")) {
                direction = "E";
                return;
            }
        }
    }
}
