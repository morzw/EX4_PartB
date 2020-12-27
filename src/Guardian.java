import java.util.ArrayList;
import java.util.List;

public class Guardian {

    private String ID;
    private List<Child> children;
    private UserInterface system;
    private CreditCard creditCard;
    Account account;

    public Guardian(String ID) {
        this.ID = ID; //??????????
        this.children = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChildren(Child child) {
        this.children.add(child);
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
}
