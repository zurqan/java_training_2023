package session7_2;

import session7.User;

public class Person2  extends User {
    public void print(){
        System.out.println("this.name = " + this.name);
        System.out.println(this.age);
//        System.out.println(this.nationalId);//compilation error
//        test2(); //compilation error
//        this.password compilation error

    }
}
