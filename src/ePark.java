import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ePark {

    private HashMap<String, Device> devices;
    private HashMap<String, Guardian> guardians;

    public ePark() {
        this.devices = new HashMap<String, Device>();
        this.guardians= new HashMap<String, Guardian>();
    }

    public void addDevice(String ID,Device device){
        this.devices.put(ID, device);
    }

    public void removeDevice(String ID){
        this.devices.remove(ID);
    }

    public void addGuardian(String ID, Guardian guardian){
        this.guardians.put(ID, guardian);
    }

    public void removeGuardian(String ID){
        this.guardians.remove(ID);
    }

    public Device getDevice(String ID){
        return this.devices.get(ID);
    }

    public Guardian getGuardian(String ID){
        return this.guardians.get(ID);
    }

    public void setDeviceOpen(String ID, boolean status){
        this.devices.get(ID).setOpen(status);
    }

    public void setDevicesProper(String ID, boolean status){
        this.devices.get(ID).setProper(status);
    }

    public ArrayList<Device> checkDevices(Child child){
        Iterator it = devices.entrySet().iterator();
        ArrayList<Device> result = new ArrayList<>();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Device device = (Device) pair.getValue();
            if(device.isValidForChild(child)){
                result.add(device);
            }
        }
        return result;
    }

    public HashMap<String, Device> getDevices() {
        return devices;
    }
}
