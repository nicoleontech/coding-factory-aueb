package gr.aueb.cf.ch20.predicates;

public class Teacher {

    private int teacherId;
    private String firstname;
    private String lastname;

    public Teacher(int teacherId, String firstname, String lastname) {
        this.teacherId = teacherId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void printFullName() {
        System.out.println(String.format("%d, %s, %s ", teacherId, firstname, lastname));
    }

    public static void printTeacher(Teacher teacher) {
        System.out.println(String.format("%d, %s, %s ", teacher.getTeacherId(), teacher.getFirstname(), teacher.getLastname()));
    }
}
