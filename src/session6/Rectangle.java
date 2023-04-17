package session6;

public class Rectangle extends Shape{

    private  int width;
    private  int length;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;

    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    public void setWidth(int width){
        this.width=width;
    }
    public void setLength(int length){
        this.length=length;
    }
}
