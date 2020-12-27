public class ExtremeDevice extends Device {

    public ExtremeDevice(String ID, double price, int ageLimit, double HeightLimit, double weightLimit) {
        super(ID, price, ageLimit, HeightLimit, weightLimit);
    }

    public boolean isExtreme() {
        return true;
    }

}
