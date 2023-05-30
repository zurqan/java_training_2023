package session26.ocp.step1;

public class Application {

    public static double calculateArea(Rectangle... rects){
        double sum =0;
        for (Rectangle rect : rects) {
            sum+= rect.getHeight()*rect.getWidth();
        }
        return sum;
    }
}
