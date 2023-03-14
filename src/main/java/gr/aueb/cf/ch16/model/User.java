package gr.aueb.cf.ch16.model;

public class User extends IdentifiableEntity{
    private String firstname;
    private String lastname;
    private String ssn;

    public User(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    //Copy Constructor, copies state
    //Deep copy created, because strings are immutable fields
    //If we had objects, we should use new()
    public User(User user){
        firstname = user.firstname; //ή user.getFirstname(
        lastname = user.lastname;
        ssn = user.ssn;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
