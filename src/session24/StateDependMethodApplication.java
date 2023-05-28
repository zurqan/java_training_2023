package session24;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StateDependMethodApplication {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Iterator<Integer> iterator = numbers.iterator();

        while (true){
            try {
                Integer number = iterator.next();//assume there is no hasNext method
                System.out.println("number = " + number);
            } catch (NoSuchElementException e) {
                System.out.println("reach end of list");
                break;
            } finally {
                System.out.println("finally");
            }
        }

        Iterator<Integer> iterator2 = numbers.iterator();

        while (iterator2.hasNext()){//state check method
                Integer number = iterator2.next();
                System.out.println("number = " + number);


        }
    }
}
