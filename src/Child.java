import java.util.Random;

public class Child {

    private String name;
    private int ID;
    private String password;
    private eTicket eTicket;

    public Child(String name, String password, int age, double timeLimit,double height,double weight) {
        Random rand = new Random();
        this.name = name;
        this.ID = rand.nextInt();
        this.password = password;
        this.eTicket = new eTicket(name, age, timeLimit,height,weight);
    }

    public String getName() {
        return name;
    }

    public double getAmount(){
        return eTicket.getAmount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public eTicket geteTicket() {
        return eTicket;
    }

    public void seteTicket(eTicket eTicket) {
        this.eTicket = eTicket;
    }
}
