package session20.statics;

import session13.Course;
import session13.Gender;
import session13.Student;

import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;
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

        IntSummaryStatistics summary = Stream
                .of(students)
                .map(Student::getAge)
                .collect(Collectors.summarizingInt(a -> a));

        System.out.println("summary = " + summary);

        IntSummaryStatistics summary2 = Stream
                .of(students)
                .collect(Collectors.summarizingInt(Student::getAge));

        IntSummaryStatistics summary3 = Stream
                .of(students)
                .collect(Collectors.summarizingInt(s->s.getCourse().size()));

        System.out.println("summary3 = " + summary3);

    }
}
