package gr.aueb.cf.ch16.functional;

public class Main {

    public static void main(String[] args) {
        Student[] students = {new Student(1, "Nicole", "S"),
                new Student(2, "Ioli", "G"),
                new Student(3, "Laura", "P"),
                new Student(4, "Dominique", "K")};

        //functional interface
        printStudentsById(students, new IDChecker() {
            @Override
            public boolean checkId(Student student) {
                return student.getId() == 1;
            }
        });

        //using lambda
        printStudentsById(students, student -> student.getId() <= 3);
    }

    public static void printStudentsById(Student[] students, IDChecker checker) {
        for (Student student : students) {
            if (checker.checkId(student)) {
                System.out.println(student);
            }
        }
    }


}
