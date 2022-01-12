class Line {
    private int a;
    private int b;
    private int c;

    public Line (int d, int e, int f) {
        a = d;
        b = e;
        c = f;
    }
    public double getSlope() {
        return -a/((double)b);
    }
    public boolean isOnLine (int x, int y){
        if (((a * x) + (b * y) + c) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isParallel(Line other) {
        if (this.getSlope() == other.getSlope()) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return (a + "x + " + b + "y + " + c + " = 0");
    }

}
