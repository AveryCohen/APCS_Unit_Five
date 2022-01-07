public class Item {
    private String partNumber;
    private String partDescription;
    private double pricePerItem;

    Item(String n, String d, double p) {
        partNumber = n;
        partDescription = d;
        if (p<0) {
            pricePerItem = 0;
        }
        else {
            pricePerItem = p;
        }
    }
    public double getTotalPrice (int quantity) {
        if (quantity < 0) {
            return 0;
        }
        else {
            return quantity * pricePerItem;
        }
    }

}
