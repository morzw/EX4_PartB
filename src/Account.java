public class Account {

    private double limit;
    private double totalPrice;

    public Account(double limit, double totalPrice) {
        this.limit = limit;
        this.totalPrice = totalPrice;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
