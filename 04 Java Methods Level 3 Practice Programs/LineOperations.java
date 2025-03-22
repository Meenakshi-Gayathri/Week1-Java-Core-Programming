import java.util.*;

public class LineOperations {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        equation[0] = m;
        equation[1] = b;
        return equation;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println(distance);
        System.out.println(lineEquation[0] + lineEquation[1]);
    }
}
