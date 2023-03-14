package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
        IKnight knight1 = new Knight();
        IKnight knight2 = new Knight();


        knight1.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save cats from around the world");
            }
        });

        knight2.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });

        //using lambda, we just use the implementation of IMission
        knight2.embarkOnMission(()-> killTheDragon());

        //using method referencing
        knight2.embarkOnMission(Main::killTheDragon);
    }

    public static void killTheDragon(){
        System.out.println("Kill the dragon");
    }
}
