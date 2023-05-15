package session17;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {


    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        System.out.println("map.get(2) = " + map.get(2));

        map.put(2,"new 2");
        System.out.println("map.get(2) = " + map.get(2));

        String default_ten = map.getOrDefault(10, "Default Ten");
        System.out.println("default_ten = " + default_ten);

        String orDefault = map.getOrDefault(1, "Default for 1");
        System.out.println("orDefault = " + orDefault);

        String data = map.computeIfAbsent(1, k -> "New One");
        System.out.println("data = " + data);
        System.out.println("map.get(1) = " + map.get(1));

        map.compute(1,(k,v)->{
            System.out.println("k = " + k);
            System.out.println("v = " + v);
            return "new "+v;
        });

        System.out.println("map.get(1) = " + map.get(1));

        map.compute(20,(k,v)->{
            System.out.println("k = " + k);
            System.out.println("v = " + v);//null
            return "new "+v;
        });

        System.out.println("map.get(20) = " + map.get(20));



        map.keySet()
                .stream()
                .forEach(System.out::println);

        map.entrySet()
                .stream()
                .forEach(System.out::println);
    }
}
