public class EastOriented implements Orientation {
    private Coordinate coordinate;

    EastOriented(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation turnRight() {
        return new SouthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation moveForward() {
        return new EastOriented(new Coordinate(coordinate.getXPos() + 1, coordinate.getYPos()));
    }

    @Override
    public Orientation moveBackward() {
        return new EastOriented(new Coordinate(coordinate.getXPos() - 1, coordinate.getYPos()));
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}
