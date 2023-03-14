package gr.aueb.cf.ch15.seminarsinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Organizer extends User{

    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarInvitation> seminarInvitations = new ArrayList<>();


    //access from package
    List<Seminar> getSeminars() {
        return seminars;
    }

    //crud method
    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    //access from package
     List<SeminarInvitation> getSeminarInvitations() {
        return seminarInvitations;
    }

    //crud method
    public List<SeminarInvitation> getAllSeminarInvitations() {
        return Collections.unmodifiableList(this.seminarInvitations);
    }

    public void setSeminarInvitations(List<SeminarInvitation> seminarInvitations) {
        this.seminarInvitations = seminarInvitations;
    }

    public boolean addSeminar(Seminar seminar){
        if (seminar == null){
            return false;
        }
        if(seminar.getOrganizer()==this){
            return false;
        }
        this.seminars.add(seminar);
        seminar.setOrganizer(this);
        return true;
    }

    public boolean addSeminarInvitation(SeminarInvitation seminarInvitation){
        if (seminarInvitation == null){
            return false;
        }
        if(seminarInvitation.getSender()==this){
            return false;
        }
        this.seminarInvitations.add(seminarInvitation);
        seminarInvitation.setSender(this);
        return true;
    }
}
