package session25_revesion.anonclass;

public class AnonClassApplication {

    public static class EnglishGreeting implements Greeting{

        @Override
        public String sayHello() {
            return "Hello!";
        }

        @Override
        public String sayHello(String name) {
            return "Hello "+name;
        }
    }
    public static void main(String[] args) {

        EnglishGreeting englishGreeting = new EnglishGreeting();
        System.out.println("englishGreeting.sayHello(\"Ahmad\") = " + englishGreeting.sayHello("Ahmad"));

        Greeting arabicGreeting = new Greeting() {
            @Override
            public String sayHello() {
                return "مرحبا";
            }

            @Override
            public String sayHello(String name) {
                return "مرحبا "+name;
            }
        };

        System.out.println("arabicGreeting.sayHello(\"احمد\") = " + arabicGreeting.sayHello("احمد"));

    }
}
