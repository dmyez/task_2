public class PointExample {
    static double [] x;
    static double [] y;
    static double [] z;
    static double [] color;
    static int pointsCount = 0;

    public static void main (String[] args) {
        x = new double[100];
        y = new double[100];
        z = new double[100];
        color = new double[100];
    }

    static void addPoint (double xx, double yy, double zz, double colorr) {
        x[pointsCount] = xx;
        y[pointsCount] = yy;
        z[pointsCount] = zz;
        color[pointsCount] = colorr;
        pointsCount++;

    }
   // static void printPoints(1);
}
