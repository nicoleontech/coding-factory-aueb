package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point();
        Point2D point2 = new Point2D();
        //also accepted Πολυμορφισμός υποτύπων, μπορώ να διαχωρίσω τον τύπο από υποτύπους
        Point point3 = new Point2D();
        //But since point3 is a Point, we can't access methods from Point2D, only if we use casting
        ((Point2D) point3).setY(12);

        Point3D point4 = new Point3D();

        doMovePlus10(point1);
        doMovePlus10(point2);
        doMovePlus10(point4);

    }

    //Polymorphism : at runtime duo to late binding we
    //know with point actually calls the method
    //But if movePlus10 was static, we couldn't use that feature of polymorphism
    //static methods are bound at compile time
    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
