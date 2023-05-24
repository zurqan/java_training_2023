package session23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastApplication {


    public static void main(String[] args) {

//        List<Integer> numbers = new ArrayList<>(){{add(1);add(2);add(3);}};
        List<Integer> numbers = new CopyOnWriteArrayList<>(){{add(1);add(2);add(3);}};

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                numbers.add(i);
            }
        }).start();


        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println("num = " + num);
        }


//        for (int i = 0; i < 20; i++) {
//            new Thread(()->{
//
//                System.out.println("numbers = " + numbers);
//            }).start();
//        }
    }
}
