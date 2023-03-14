package gr.aueb.cf.challenges;

public class FrogJumps {

    public int findFrogJumps(double startPoint, double endPoint, double vector) {
        return (int) Math.ceil((endPoint - startPoint) / vector);
    }
}
