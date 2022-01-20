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
    Fraction() {
        numerator = 1;
        denominator = 1;
    }
    public static Fraction add(Fraction f1, Fraction f2) {

    }
    public static Fraction subtract(Fraction f1, Fraction f2) {

    }
    public static Fraction multiply(Fraction f1, Fraction f2) {

    }
    public static Fraction divide(Fraction f1, Fraction f2) {

    }
    public int gcd(int numerator, int denominator) {

    }
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }



}
