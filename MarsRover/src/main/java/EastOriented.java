public class EastOriented implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOriented();
    }
}
