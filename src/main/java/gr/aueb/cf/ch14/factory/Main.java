package gr.aueb.cf.ch14.factory;

public class Main {

    public static void main(String[] args) {
        Point p1 = Point.getRandomPoint();
        Point p2 = Point.getZeroPoint();

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());

    }
}
