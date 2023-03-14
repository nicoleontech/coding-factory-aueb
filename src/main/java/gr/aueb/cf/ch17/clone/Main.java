package gr.aueb.cf.ch17.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        City clonedAthens = athens.clone();

        System.out.println(athens);
        System.out.println(clonedAthens);

        clonedAthens.setDescription("Athens 2023");

        System.out.println(athens);   //String is immutable
        System.out.println(clonedAthens);

        Trainee nicole = new Trainee("Nicole", new City("Athens"));
        Trainee clonedAlice = nicole.clone();

        clonedAlice.setCity(new City("Athens 2023"));
        System.out.println(nicole);
        System.out.println(clonedAlice);

        Trainee bob = new Trainee(nicole);
        bob.getCity().setDescription("London");
        System.out.println(nicole);
        System.out.println(bob);
    }
}
