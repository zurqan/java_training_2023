package session26.isp.step2;


public class Car implements Toy,Movable {

    private final String color;
    private final double price;

    public Car(String color, double price) {
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
//move
    }

}
