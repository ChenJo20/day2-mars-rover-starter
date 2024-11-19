public class WestOriented implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOriented();
    }
}
