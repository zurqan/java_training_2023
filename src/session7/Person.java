package session7;

import session7.part3.UserManagement;

public class Person extends User  {

    public void print(){
        System.out.println("this.name = " + this.name);
        System.out.println(this.age);
        System.out.println(this.nationalId);
        test2();
//        this.password compilation error
    }


}
