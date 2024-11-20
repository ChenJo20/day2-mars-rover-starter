public class SouthOriented implements Orientation {
    private Coordinate coordinate;

    SouthOriented(Coordinate coordinate) {
        this.coordinate = coordinate;
    }


    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation turnRight() {
        return new WestOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos()));
    }

    @Override
    public Orientation moveForward() {
        return new SouthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos() - 1));
    }

    @Override
    public Orientation moveBackward() {
        return new SouthOriented(new Coordinate(coordinate.getXPos(), coordinate.getYPos() + 1));
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }


}
