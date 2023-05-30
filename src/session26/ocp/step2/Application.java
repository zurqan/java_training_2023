package session26.ocp.step2;

public class Application {

    public static double calculateArea(Shape... shapes){
        double sum =0;
        for (Shape shape : shapes) {
            ShapeType type = shape.getType();
            switch (type){
                case CIRCLE :
                    sum+= Math.pow(((Circle)shape).getRadius(),2)*Math.PI;
                    break;
                case RECTANGLE:
                    sum+= ((Rectangle)shape).getHeight()*((Rectangle)shape).getWidth();
                    break;
            }
        }
        return sum;
    }
}
