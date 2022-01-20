public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double CAPACITY = 20.0;
    private static double totalFuel;

    Truck(String a) {
        truckID = a;
        odometer = 0.0;
        mpg = 0.0;
        fuel = 0.0;
    }

    Truck(String b, double c, double d, double e) {
        truckID = b;
        odometer = c;
        mpg = d;
        fuel = e;
    }
    public String getTruckID() {
        return truckID;
    }
    public double getOdometer() {
        return odometer;
    }
    public double getMpg() {
        return mpg;
    }
    public double getFuel() {
        return fuel;
    }
    public void setMpg(double m) {
        mpg = m;
    }

    public boolean enoughFuel(double miles) {
        double range = mpg * fuel;
        if (range >= miles) {
            return true;
        }
        else {
            return false;
        }
    }



}
