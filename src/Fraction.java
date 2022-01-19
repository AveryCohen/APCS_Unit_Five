public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int n, int d) {

        if ((Math.abs(n) != n && Math.abs(d) == d) || (Math.abs(d) != d && Math.abs(n) == n)) {
            numerator = Math.abs(n) * -1;
            denominator = Math.abs(d);
        }
        else {
            numerator = Math.abs(n);
            denominator = Math.abs(d);
        }

    }
    public int gcd(int a, int m) {

    }



}
