package session6;

public class Circle extends Shape{

    private  int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
