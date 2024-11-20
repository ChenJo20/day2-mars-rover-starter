public interface Orientation {
    Coordinate coordinate = new Coordinate();

    public Direction getDirection();

    public Orientation turnLeft();

    public Orientation turnRight();
}
