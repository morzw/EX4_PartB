import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Guardian {

    private String ID;
    private HashMap<String,Child> children;
    private UserInterface system;
    private UserInterface website;
    private CreditCard creditCard;
    Account account;

    public Guardian(String ID) {
        this.ID = ID;
        this.children = new HashMap<String, Child>();
    }

    public UserInterface getWebsite() {
        return website;
    }

    public void setWebsite(UserInterface website) {
        this.website = website;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public HashMap<String, Child> getChildren() {
        return children;
    }

    public void addChildren(Child child) {
        this.children.put(child.getName(),child);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public UserInterface getSystem() {
        return system;
    }

    public void setSystem(UserInterface system) {
        this.system = system;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Child exitPark(String childName){
        Child child =children.get(childName);
        children.remove(childName);
        system.exitChildFromPark(child);
        return child;
//        TODO: tell mor the function is returning child
    }
}