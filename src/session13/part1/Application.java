package session13.part1;

import session13.Course;
import session13.Gender;
import session13.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        Stream
                .of(students)
                .forEach(s -> {
                    System.out.println(s);
                });
        Stream
                .of(students)
                .forEach(s -> System.out.println(s));

        Stream
                .of(students)
                .forEach(System.out::println);//Method ref


        Stream
                .of(students)
                .map(s -> s.getName())
                .forEach(System.out::println);

        Stream
                .of(students)
                .filter(Student::isActive)
//                .map(s->s.getName())
                .forEach(System.out::println);

        Stream<Course> courseStream = Stream
                .of(students)
                .flatMap(s -> {
                    Stream<Course> stream = s.getCourse().stream();
                    return stream;
                });


        Stream
                .of(students)
                .flatMap(s -> s.getCourse().stream())
                .forEach(System.out::println);

        System.out.println("=========");
        Stream
                .of(students)
                .flatMap(s -> s.getCourse().stream())
                .distinct()
                .forEach(System.out::println);

        Stream<Stream<Course>> streamStream = Stream
                .of(students)
                .map(s -> {
                    Stream<Course> stream = s.getCourse().stream();
                    return stream;
                });

        List<String> studentsNames = Stream.of(students)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("studentsNames = " + studentsNames);

        Map<Gender, List<Student>> studentByGender = Stream
                .of(students)
                .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.toList()));

        System.out.println("studentByGender = " + studentByGender);


        Map<Gender, List<String>> namesByGender =
                Stream
                        .of(students)
                        .collect(Collectors.groupingBy(
                                s -> s.getGender(),
                                Collectors.mapping(s -> s.getName(), Collectors.toList())));



        System.out.println("namesByGender = " + namesByGender);

        Stream
                .of(students)
                .map(s -> {
                    System.out.println("Name is: "+s.getName());
                    return s.getName();
                })
                .sorted()
                .forEach(System.out::println);


        System.out.println("================");
        Stream<String> stdNames = Stream
                .of(students)
                .map(s -> {
                    System.out.println("Name is: "+s.getName());
                    return s.getName();
                });

        Stream<Student> studentStream = Stream
                .of(students)
                .filter(s -> s.isActive());
        Stream<String> stringStream = studentStream.map(s -> s.getName());
        Stream<String> stringStream1 = stringStream.map(name -> "Hello " + name);
        stringStream1.forEach(System.out::println);


        int sum = IntStream
                .rangeClosed(1, 10)
                .reduce(0, (acc, e) -> acc + e);

        System.out.println("sum = " + sum);

    }

//    print(1);
//    print(1,2,3);
//
//    print(1,2,3,4,5);

    private static void print(int... a) {
        for (int i : a) {
            System.out.println("i = " + i);
        }
    }
}
