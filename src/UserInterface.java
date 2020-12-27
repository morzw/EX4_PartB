import java.util.List;

public abstract class UserInterface implements UserInterfaceMethods {
    public Guardian guardian;


    public eTicket getETicket(Child child) {
        return child.geteTicket();
    }
}
