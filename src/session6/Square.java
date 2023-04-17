package session6;

public class Square  extends Rectangle{
    public Square(String name, int length) {
        super(name, length, length);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
