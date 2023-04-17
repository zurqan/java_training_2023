package session6;

public class AreaApplication {


    public static void printAreaInfo(Shape shape){

        double area = shape.calculateArea();
        System.out.println("Name: "+shape.getName()+", area = " + area);

    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("Rect1",100,9);
//        Shape rect1 = new Rectangle("Rect1",100,9);
//        Circle cir1 = new Circle("Circle 1",10);
        Shape cir1 = new Circle("Circle 1",10);

        Square sq1 = new Square("Sq1", 10);
        printAreaInfo(rect1);
        printAreaInfo(cir1);
        printAreaInfo(sq1);
        rect1.setLength(5);
        rect1.setWidth(10);
        printAreaInfo(rect1);

        sq1.setLength(5);
        printAreaInfo(sq1);


        expandRectangleToFit(sq1);
    }


    //Liskove substitution principle
    public static void expandRectangleToFit(Rectangle rectangle){
        rectangle.setLength(11);
        rectangle.setWidth(12);
        printAreaInfo(rectangle);
    }
}
