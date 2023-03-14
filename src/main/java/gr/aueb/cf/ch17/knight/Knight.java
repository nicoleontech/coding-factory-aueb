package gr.aueb.cf.ch17.knight;

public class Knight implements IKnight {


//    public Knight(IMission mission) {
//        this.mission = mission;
//    }

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();

    }
}
