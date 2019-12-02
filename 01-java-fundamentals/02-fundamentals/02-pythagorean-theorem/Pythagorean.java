import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int lenA, int lenB) {
        double result = lenA * lenA + lenB * lenB;
        return Math.sqrt(result);
    }
}

