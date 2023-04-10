package session4;

public class NewSwitchFeatures {

    public static void main(String[] args) {
        int a =0;
//        switch (a){
//
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//                System.out.print( "less or eq to 3");
//                break;
//            case 4:
//                System.out.println("Grater than 3");
//
//        }

        switch (a){

            case 0,1,2,3:
                System.out.print( "less or eq to 3");
                break;
            case 4:
                System.out.println("Grater than 3");

        }

        String msg = switch (a){

            case 0,1,2,3:
                yield "less or eq to 3";

            case 4:
                yield "Grater than 3";
            default:
                yield "Large Number";

        };

        switch (a){

            case 0,1,2,3->
                System.out.print( "less or eq to 3");
            case 4 ->{
                System.out.println("Grater than 3");
            }

        }

        String msg2 = switch (a){

            case 0,1,2,3->{
                yield "less or eq to 3";
            }

            case 4->{
                yield "Grater than 3";
            }
            default->{
                yield "Large Number";
            }

        };

    }
}
