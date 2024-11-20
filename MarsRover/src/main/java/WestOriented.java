public class WestOriented implements Orientation {
    private Coordinate coordinate;

    WestOriented(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation turnRight() {
        return new NorthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation moveForward() {
        return new WestOriented(new Coordinate(coordinate.getXPos() - 1, coordinate.getYPos()));
    }

    @Override
    public Orientation moveBackward() {
        return new WestOriented(new Coordinate(coordinate.getXPos() + 1, coordinate.getYPos()));
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}
