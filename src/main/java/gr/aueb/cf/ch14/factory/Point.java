package gr.aueb.cf.ch14.factory;

import java.util.Random;

/**
 * Point Java Bean.
 */

public class Point {

    private double x;

    public Point(double x) {
        this.x = x;
    }

    public Point() {
        //jvm by default initialises x as a double to 0.0
        //x = 0.0;
    }

    public static Point getInstance() {
        return new Point();
    }

    /**
     * A static factory that returns
     * a (0, 0) point.
     *
     * @return a new (0,0) point
     */

    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * A static factory that returns
     * a random point between 0-100
     *
     * @return a new between 0-100 point
     */

    public static Point getRandomPoint() {
        Random random = new Random(System.currentTimeMillis());
        return new Point(random.nextDouble() * 101);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String pointToString() {
        return "(" + x + ")";
    }
}
