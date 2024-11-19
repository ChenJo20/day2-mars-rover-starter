public class NorthOriented implements Orientation {

    @Override
    public Direction getDirection() {
        return Direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOriented();
    }

    @Override
    public Orientation turnRight() {
        return new EastOriented();
    }
}
