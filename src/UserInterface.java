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

//    public void addDevices(Child child, String deviceID, Device device){}

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
        for (String deviceID: ePark.getDevices().keySet()){
            if (ePark.getDevices().get(deviceID).isValidForChild(child)){
                devicesForChild.add(deviceID);
            }
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

