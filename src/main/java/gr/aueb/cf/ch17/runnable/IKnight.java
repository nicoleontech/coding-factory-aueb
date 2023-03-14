package gr.aueb.cf.ch17.runnable;

public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new KillTheDragonMission(),
            new SaveAllCatsMission()
    };

    void embarkOnMission(IMission mission);
}
