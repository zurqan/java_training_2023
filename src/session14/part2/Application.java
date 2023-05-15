package session14.part2;

import session13.Course;
import session13.Gender;
import session13.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

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

        Optional<Student> first = Stream.of(students)
                .filter(s -> s.getAge() < 15)
                .findFirst();

        System.out.println("first = " + first);

        Optional<Student> studentWithAgeGT15 = Stream.of(students)
                .filter(s -> s.getAge() > 15)
                .findFirst();

        System.out.println("studentWithAgeGT15 = " + studentWithAgeGT15);

        List<Student> orderedStudent = Stream
                .of(students)
                .sorted()
                .collect(Collectors.toList());

        orderedStudent
                .stream()
                .forEach(System.out::println);

        System.out.println("======");
        Stream
                .of(students)
                .sorted((s1,s2)->String.CASE_INSENSITIVE_ORDER.compare(s1.getName(),s2.getName()))
                .forEach(System.out::println);

        System.out.println("======");
        Stream
                .of(students)
                .sorted(comparingInt(Student::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("======");
        Stream
                .of(students)
                .sorted(comparing(Student::getAge).thenComparing(comparing(Student::getName).reversed()))
                .forEach(System.out::println);


        System.out.println("===========");
        Map<Gender, Long> studentGenderCount = Stream
                .of(students)
                .collect(groupingBy(s -> s.getGender(), counting()));

        System.out.println("studentGenderCount = " + studentGenderCount);

        Map<Gender, List<Student>> stByGender = Stream
                .of(students)
                .collect(groupingBy(s -> s.getGender(), toList()));
        System.out.println("stByGender = " + stByGender);


        Map<Gender, List<String>> stNamesByGender = Stream
                .of(students)
                .collect(groupingBy(Student::getGender, mapping(Student::getName, toList())));
        System.out.println("stNamesByGender = " + stNamesByGender);

    }
}
