public class Device {

    private String ID;
    private double price;
    private int ageLimit;
    private double heightLimit;
    private double weightLimit;
    private boolean isProper;
    private boolean isOpen;

    public Device(String ID, double price, int ageLimit, double heightLimit, double weightLimit) {
        this.ID = ID;
        this.price = price;
        this.ageLimit = ageLimit;
        this.heightLimit = heightLimit;
        this.weightLimit = weightLimit;
        this.isProper = true;
        this.isOpen = true;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public double getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(double heightLimit) {
        this.heightLimit = heightLimit;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public boolean isProper() {
        return isProper;
    }

    public void setProper(boolean proper) {
        isProper = proper;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isExtreme() {
        return false;
    }
}
