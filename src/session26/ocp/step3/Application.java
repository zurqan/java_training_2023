package session26.ocp.step3;


public class Application {

    public static double calculateArea(Shape... shapes){
        double sum =0;
        for (Shape shape : shapes) {
            sum+=shape.calculateArea();
        }
        return sum;
    }
}
