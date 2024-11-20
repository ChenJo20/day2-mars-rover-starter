public interface Orientation {

    public Direction getDirection();

    public Orientation turnLeft();

    public Orientation turnRight();

    public Orientation moveForward();

    public Coordinate getCoordinate();
}
