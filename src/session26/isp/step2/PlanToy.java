package session26.isp.step2;


public class PlanToy implements Toy,Movable,Flyable {
    private final String color;
    private final double price;

    public PlanToy(String color, double price) {
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
        //do movement
    }

    @Override
    public void fly() {
        //fly
    }
}
