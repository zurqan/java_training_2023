package session7.part2;

public final class User {//you can not have sub-class

    private final String name;
    private final String nationalId;
    private int age;

    public User(String name, String nationalId, int age) {
        this.name = name;
        this.nationalId = nationalId;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public final void print(){//you can not override this method
        System.out.println("User.print");
    }

    public static void main(String[] args) {
        User mohammad = new User("Mohammad", "1010", 10);
        mohammad.age=20;
//        mohammad.nationalId="333";//compilation error
    }

    public void setAge(int age){
        this.age=age;
    }
}
