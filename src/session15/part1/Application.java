package session15.part1;

import session13.Course;
import session13.Gender;
import session13.Student;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {
    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 20, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };

    public static void main(String[] args) {
        ExpandedArray<Integer> numbers = ExpandedArray.of(1,2,3,4,5,6,7,8,9,10);

        Integer sum = numbers.reduceL(0, acc -> e -> acc + e);
        System.out.println("sum = " + sum);

//        "12345678910"
        String s = numbers.reduceL("", acc -> e -> acc + e);
        System.out.println("s = " + s);

        String howReduceLIsworking = numbers.reduceL("0", acc -> e -> "(" + acc + "+" + e + ")");
        System.out.println("howReduceLIsworking = " + howReduceLIsworking);


        Integer sumFromR = numbers.reduceR(0, e -> acc -> e + acc);
        System.out.println("sumFromR = " + sumFromR);

        String howReduceRLIsworking = numbers.reduceR("0", e -> acc -> "(" + e + "+" + acc + ")");
        System.out.println("howReduceRLIsworking = " + howReduceRLIsworking);


        ExpandedArray<Integer> numberMul2 = numbers.map(e -> e * 2);

        numberMul2.forEach(System.out::println);

        ExpandedArray<String> numberStr = numbers.map(e -> "Number is " + e);
        numberStr.forEach(System.out::println);

        Predicate<Integer> isEven = e -> e % 2 == 0;
        ExpandedArray<Integer> evenNumbers = numbers.filter(isEven);
        evenNumbers.forEach(System.out::println);
        ExpandedArray<Integer> oddNumbers = numbers.filter(isEven.negate());
        System.out.println("Odd numbers");
        oddNumbers.forEach(System.out::println);

        Map<String, ExpandedArray<Integer>> grouping = numbers.grouping(e -> e % 2 == 0 ? "Even" : "Odd");
        System.out.println("grouping = " + grouping);


        ExpandedArray
                .of(students)
                .map(Student::getName)
                .forEach(System.out::println);

        Map<Gender, ExpandedArray<Student>> stdGroupingByGender = ExpandedArray
                .of(students)
                .grouping(Student::getGender);

        System.out.println("stdGroupingByGender = " + stdGroupingByGender);

        Map<Gender, ExpandedArray<String>> stdNamesByGender = ExpandedArray
                .of(students)
                .grouping(Student::getGender, Student::getName);

        System.out.println("stdNamesByGender = " + stdNamesByGender);

        Map<String, ExpandedArray<String>> stdBuyAgeCategory = ExpandedArray
                .of(students)
                .grouping(std -> std.getAge() >= 20 ? "GE 20" : "LT 20", Student::getName);

        System.out.println("stdBuyAgeCategory = " + stdBuyAgeCategory);

//        int b = 5;
//        Function<Integer,Integer> add5= a->a+b;


    }

}
