package session26.ocp.step3;

import session26.ocp.step2.ShapeType;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }
}
