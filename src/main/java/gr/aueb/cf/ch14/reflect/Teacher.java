package gr.aueb.cf.ch14.reflect;

public class Teacher {

    private Long id;
    private String firstName;
    private String lastName;

    public Teacher(Long id) {
        this.id = id;
    }

    public Teacher() {

    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }
}
