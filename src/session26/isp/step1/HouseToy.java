package session26.isp.step1;

public class HouseToy implements Toy{

    private final String color;
    private final double price;

    public HouseToy(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void move() {
        throw new RuntimeException("Not Supported");

    }

    @Override
    public void fly() {
        throw new RuntimeException("Not Supported");

    }

}
