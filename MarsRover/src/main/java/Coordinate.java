public class Coordinate {
    public static final String COORDINATE_FORMATTER = "%d:%d";
    private int xPos;
    private int yPos;

    public Coordinate() {
        this.xPos = 0;
        this.yPos = 0;
    }

    public Coordinate(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String showCoordinate() {
        return String.format(COORDINATE_FORMATTER, xPos, yPos);
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return yPos;
    }
}
