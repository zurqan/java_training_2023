package session19;

import java.util.Collections;
import java.util.List;

public class WildApplication {

    public static void main(String[] args) {

    }

    public static void operation(List<?> list){//List<? extends Object>
//        list.set(0,list.get(0));
        addT(list);
        Object o = list.get(0);

//        List temp = list;
//        temp.set(0,temp.get(0));
    }

    private static <T> void addT(List<T> tList){
        tList.set(0,tList.get(0));

//        Collections.swap();
    }

}
