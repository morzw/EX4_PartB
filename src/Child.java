public class Child {

    private String name;
    private String ID;
    private String password;
    private eTicket eTicket;

    public Child(String name, String ID, String password, int age, double timeLimit) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.eTicket = new eTicket(ID, age, timeLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
