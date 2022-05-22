public class Tests {
    /**
     * Tests whether two floating-point numbers are
     * equal, except for a roundoff error
     * x a floating-point number
     * y a floating-point number
     * returns true if x and y are approximately equal
     */

    public static boolean approxEqual(double x, double y) {

        final double imad = 1E-10;
        if (Math.abs(x - y) < imad) {
            return (true);

        }
        return (false); // more numeric methods can be added here
    }

}
