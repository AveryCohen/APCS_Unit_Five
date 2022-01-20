public class FractionDriver {
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(-2, 4);
        Fraction f2 = new Fraction(15, -4);
        System.out.println(f1);
        System.out.println(f2);
        Fraction f3 = Fraction.add(f1, f2);
        System.out.println(f3);
        Fraction f4 = Fraction.subtract(f1, f2);
        System.out.println(f4);
        Fraction f5 = Fraction.multiply(f1, f2);
        System.out.println(f5);
        Fraction f6 = Fraction.divide(f1, f2);
        System.out.println(f6);
    }
}
