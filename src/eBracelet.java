public class eBracelet {

    private String nameOfChild;
    private double height;
    private double weight;

    public eBracelet(String nameOfChild) {
        this.nameOfChild = nameOfChild;
    }

    public String getNameOfChild() {
        return nameOfChild;
    }

    public void setNameOfChild(String nameOfChild) {
        this.nameOfChild = nameOfChild;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double[] location(){
        double x = Math.random();
        double y = Math.random();
        double[] location = new double[2];
        location[0] = x;
        location[1] = y;
        return location;
    }
}
