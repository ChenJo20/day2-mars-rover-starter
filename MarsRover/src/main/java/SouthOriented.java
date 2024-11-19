public class SouthOriented implements Orientation {
    @Override
    public Direction getDirection() {
        return Direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOriented();
    }

    @Override
    public Orientation turnRight() {
        return new WestOriented();
    }
}
