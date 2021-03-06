import java.util.ArrayList;
import java.util.List;

public class eTicket {

    private int age;
    private double timeLimit;
    private List<Device> devices;

    private eBracelet eBracelet;

    public eTicket(String childName, int age, double timeLimit, double height , double weight) {
        this.age = age;
        this.timeLimit = timeLimit;
        this.devices = new ArrayList<>();
        this.eBracelet = new eBracelet(childName,height,weight);
    }

    public int getAge() {
        return age;
    }

    public double getAmount() {
        return devices.size();
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void printDevices() {
        if (devices.isEmpty()) {
            System.out.println("There are no devices to show");
            return;
        }
        for (Device device: devices) {
            System.out.println(device.getID());
        }
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    public void removeDevice(Device device) {
        this.devices.remove(device);
    }

    public eBracelet geteBracelet() {
        return eBracelet;
    }

    public void seteBracelet(eBracelet eBracelet) {
        this.eBracelet = eBracelet;
    }

    public void setHeightInBracelet(double height){
        this.eBracelet.setHeight(height);
    }

    public void setWeightInBracelet(double weight){
        eBracelet.setWeight(weight);
    }
}
