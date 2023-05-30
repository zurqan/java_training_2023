package session26.ocp.step2;

public class Circle implements Shape{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }
}
