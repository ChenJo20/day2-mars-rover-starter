public class NorthOriented implements Orientation {
    private Coordinate coordinate;

    NorthOriented(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation turnRight() {
        return new EastOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation moveForward() {
        return new NorthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos() + 1));
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}
