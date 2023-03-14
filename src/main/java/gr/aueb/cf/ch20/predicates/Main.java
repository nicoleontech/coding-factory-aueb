package gr.aueb.cf.ch20.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface TeacherIdChecker {
    boolean checkId(Teacher teacher);
}

public class Main {
    private static List<Teacher> teachers = Arrays.asList(
            new Teacher(1, "Th.", "Andr."),
            new Teacher(2, "B.", "Dylan."),
            new Teacher(3, "L.", "Patr.")
    );

    public static void main(String[] args) {
        int id = 3;

        //using anonymous class with functional interface

//        printEqualId(teachers, new TeacherIdChecker(){
//            @Override
//            public boolean checkId(Teacher teacher) {
//                return teacher.getTeacherId() == id;
//            }
//        });

        //using lambda
        // printEqualId(teachers,teacher -> teacher.getTeacherId()==id);

        //using Predicate and method reference operator
        printEqualId(teachers, teacher -> teacher.getTeacherId() == id, Teacher::printTeacher);

        printEqualId(teachers, teacher -> teacher.getTeacherId() > id, Teacher::printFullName);

    }

    private static void printEquals(List<Teacher> teachers, int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                System.out.println("Firstname= " + teacher.getFirstname());
            }
        }
    }


    private static void printEqualId(List<Teacher> teachers, TeacherIdChecker checker) {
        for (Teacher teacher : teachers) {
            if (checker.checkId(teacher)) {
                System.out.println("Firstname= " + teacher.getFirstname());
            }
        }
    }

    //1st way
//    private static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker, Consumer<Teacher> teacherConsumer) {
//        for (Teacher teacher : teachers) {
//            if (checker.test(teacher)) {
//                teacherConsumer.accept(teacher);
//            }
//        }
//    }

    //2nd way
    private static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker, Consumer<Teacher> teacherConsumer) {
        teachers.forEach(teacher -> {
            if (checker.test(teacher)) teacherConsumer.accept(teacher);
        });
    }

}
