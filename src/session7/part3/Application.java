package session7.part3;

import session7.part2.User;

public class Application {

    public static void main(String[] args) {
        final User mohammad = new User("Mohammad", "2020", 30);

        UserManagement userManagementDBI = new UserManagementDBIImpl();
        userManagementDBI.save(mohammad);
        userManagementDBI.print(mohammad);
        System.out.println("UserManagement.sayHello(mohammad) = " + UserManagement.sayHello(mohammad));

        UserManagement userImpl2 = new UserManagementMemoryImpl();
        userImpl2.save(mohammad);
        userImpl2.print(mohammad);

        mohammad.setAge(40);
//        mohammad=new User("M","3",40);//compilation error
//        User t1= (User) "T";//compilation error

//        final String a = "a";
//        a="a";//compilation error
    }
}
