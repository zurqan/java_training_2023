package session26.ocp.step3;


import session26.ocp.step2.ShapeType;

public class Rectangle implements Shape {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public double calculateArea() {
        return width*height;
    }
}
