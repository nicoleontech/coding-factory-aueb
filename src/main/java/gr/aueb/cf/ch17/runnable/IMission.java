package gr.aueb.cf.ch17.runnable;

public interface IMission {

    MissionStatus getStatus();

    void setStatus(MissionStatus missionStatus);

    void embark();
}
