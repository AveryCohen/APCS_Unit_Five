public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(int n, int d) {
        int m = gcd(n, d);
            n = n / m;
            d = d / m;
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
    public int gcd(int n, int m) {
        while(m%n != 0) {
            int oM = m;
            int oN = n;
            m = oN;
            n = oM%oN;
        }
        return Math.abs(n);
    }
    public static Fraction add(Fraction f1, Fraction f2) {
        int f1n = f1.getNumerator();
        int f1d = f1.getDenominator();
        int f2n = f2.getNumerator();
        int f2d = f2.getDenominator();
        int fn = (f1n * f2d) + (f2n * f1d);
        int fd = f1d * f2d;
        return new Fraction(fn, fd);
    }
    public static Fraction subtract(Fraction f1, Fraction f2) {
        int f1n = f1.getNumerator();
        int f1d = f1.getDenominator();
        int f2n = f2.getNumerator();
        int f2d = f2.getDenominator();
        int fn = (f1n * f2d) - (f2n * f1d);
        int fd = f1d * f2d;
        return new Fraction(fn, fd);
    }
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int f1n = f1.getNumerator();
        int f1d = f1.getDenominator();
        int f2n = f2.getNumerator();
        int f2d = f2.getDenominator();
        int fn = f1n * f2n;
        int fd = f1d * f2d;
        return new Fraction(fn, fd);
    }
    public static Fraction divide(Fraction f1, Fraction f2) {
        int f1n = f1.getNumerator();
        int f1d = f1.getDenominator();
        int f2n = f2.getNumerator();
        int f2d = f2.getDenominator();
        int fn = f1n * f2d;
        int fd = f1d * f2n;
        return new Fraction(fn, fd);
    }
    public String toString() {
        if(Math.abs(numerator) >= Math.abs(denominator)) {
            int x = numerator / denominator;
            int strNumerator = Math.abs(numerator) % denominator;
            return x + " " + strNumerator + "/" + denominator;
        }
        else {
            return numerator + "/" + denominator;
        }
    }
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }
}
