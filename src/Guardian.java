import java.util.ArrayList;
import java.util.List;

public class Guardian {

    private String ID; //??????????
    private List<Child> children;
//    private UserInterface application;
//    private WebSite webSite;
    private CreditCard creditCard;
//    Account account;

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

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
