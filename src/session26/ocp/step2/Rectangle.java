package session26.ocp.step2;



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
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }
}
