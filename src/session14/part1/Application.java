package session14.part1;

import session13.Course;
import session13.Gender;
import session13.Student;

import java.util.Optional;

public class Application {

    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };

    public static void main(String[] args) {

        divideV2(4, 2)
                .map(a -> a * 3)
                .filter(a -> a % 2 == 0)
                .ifPresent(System.out::println);
        divideV2(4, 0)
                .map(a -> a * 3)
                .filter(a -> a % 2 == 0)
                .ifPresent(System.out::println);
        divideV2(6, 2)
                .map(a -> a * 3)
                .filter(a -> a % 2 == 0)
                .ifPresent(System.out::println);

        Integer value = divideV2(4, 2)
                .map(a -> a * 4)
                .orElse(0);

        System.out.println(value);

//        Integer integer = divideV2(4, 0)
//                .map(a -> a * 10)
//                .filter(a -> a % 2 == 0)
//                .map(a -> a + 2)
//                .orElseThrow(() -> new RuntimeException("B should not be zero"));

//        System.out.println(integer);


    }

    public static Optional<Integer> divideV2(int a, int b) {

        return b == 0
                ? Optional.empty()
                : Optional.of(a / b);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("B value should not be zero");
        }
        return a / b;
    }
}
