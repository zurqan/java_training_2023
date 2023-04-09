package session2;

public class SwitchExample {

    public static void main(String[] args) {
        int i =2;
        //byte,short,char,int,Enum ..String
        switch (i){

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Default");
        }

        switch (i){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Less than 4");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Default");
        }

        double d = 0.2;
        for (int j = 0; j < 100; d+=0.2,j++) {

        }
        System.out.println("d: "+d);

    }
}
