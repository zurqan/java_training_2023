package session7.part3;

import session7.part2.User;

public interface UserManagement {

    public void save(User user);

    public User getUserByName(String name);

//    public void print(User user);

    default void print(User user){
        System.out.println("UserManagement.print");
        user.print();
    }

    default void printV2(){
        System.out.println("UserManagement.printV2");
    }
    static String sayHello(User user){
        return "Hello "+user.getName();
    }
}
