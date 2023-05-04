package session12.part2;

import session10.part2.MyFunction;

public class Application {

    public static void main(String[] args) {

        MyFunction<String,String> greeting= a->"Hello "+a;

        MyFunction<String,String> toCaps= a->a.toUpperCase();

        MyFunction<String, String> compose = greeting.compose(toCaps);

        System.out.println("compose.apply(\"Mohammad\") = " + compose.apply("Mohammad"));

        MyFunction<String, String> compose1 = toCaps.compose(greeting);

        System.out.println("compose1.apply(\"Mohammad\") = " + compose1.apply("Mohammad"));

        User mohammad= new User("Mohammad");

        MyFunction<User,String> getName = u->u.getName();
        MyFunction<User, String> compose2 = greeting.compose(getName);
        System.out.println("compose2.apply(mohammad) = " + compose2.apply(mohammad));

        MyFunction<User, String> compose3 = toCaps.compose(getName);
        System.out.println("compose3.apply(mohammad) = " + compose3.apply(mohammad));

        MyFunction<User, String> ourApplicationGreeting = toCaps.compose(greeting.compose(getName));
        System.out.println("ourApplicationGreeting.apply(mohammad) = " + ourApplicationGreeting.apply(mohammad));


    }

    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
