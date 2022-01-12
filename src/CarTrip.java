public class CarTrip {
    // instance variables
    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double gallonsUsed;


    //constructors
    public CarTrip () {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0.0;
        gallonsUsed = 0.0;
    }
    public CarTrip (int start, int end, double time, double gallons) {
        myStartOdometer = start;
        myEndOdometer = end;
        myTime = time;
        gallonsUsed = gallons;

    }

    //methods - getters and setters first
    public int getMyStartOdometer() {
        return myStartOdometer;
    }
    public int getMyEndOdometer() {
        return myEndOdometer;
    }
    public double getMyTime() {
        return myTime;
    }
    public double getGallonsUsed() {
        return gallonsUsed;
    }
    public void setMyStartOdometer(int value) {
        myStartOdometer = value;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setGallonsUsed(double gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }
}
