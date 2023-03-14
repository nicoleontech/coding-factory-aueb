package gr.aueb.cf.ch15.seminarsinh;

public class SeminarInvitation extends Message{

    private Organizer sender;
    private SeminarInvitationType type;

    public Organizer getSender() {
        return sender;
    }

    public void setSender(Organizer sender) {
        this.sender = sender;
    }


    public SeminarInvitationType getType() {
        return type;
    }

    public void setType(SeminarInvitationType type) {
        this.type = type;
    }


}
