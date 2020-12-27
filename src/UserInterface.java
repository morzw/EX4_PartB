import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class UserInterface implements UserInterfaceMethods {
    public Guardian guardian;
    public ePark ePark;


    public eTicket getETicket(Child child) {
        return child.geteTicket();
    }

    public void addDevice(String childName, Device device){
        if (guardian.getChildren().get(childName).geteTicket().getDevices().contains(device)){
            System.out.println("ride already exists");
            return;
        }
        guardian.getChildren().get(childName).geteTicket().addDevice(device);
        System.out.println("ride was added successfully");
    }

    public void removeDevice(String childName, Device device){
        guardian.getChildren().get(childName).geteTicket().removeDevice(device);
        System.out.println("ride was removed successfully");

    }

    public void exitChildFromPark(Child child){
        double amount = child.getAmount();
        charge(amount ,guardian.getCreditCard());
    }

    @Override
    public boolean charge(double amount, CreditCard creditCard){
        guardian.account.setTotalPrice(guardian.account.getTotalPrice() - amount);
        return true;
    }

    public void getDevicesForChild(Child child) {
        ArrayList<String> devicesForChild = new ArrayList<>();
        if (ePark.getDevices().isEmpty()){
            System.out.println("There are no devices to show");
            return;
        }
        for (String deviceID: ePark.getDevices().keySet()){
            if (ePark.getDevices().get(deviceID).isValidForChild(child)){
                devicesForChild.add(deviceID);
            }
        }
        if (devicesForChild.isEmpty()){
            System.out.println("There are no devices to show");
            return;
        }
        for (String deviceID: devicesForChild){
            System.out.println(deviceID);
        }
    }

    @Override
    public void control() {

    }

    @Override
    public void showChildrenLocationOnMap() {

    }

    @Override
    public void addNewEntry(Child child) {

    }
}

