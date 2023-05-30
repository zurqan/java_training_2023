package session26.ocp.step3;

public class Square implements Shape{

    private final int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side*side;
    }
}
