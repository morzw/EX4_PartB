public interface UserInterfaceMethods {
    void control();
    void showChildrenLocationOnMap();
    eTicket getETicket(Child child);
    void addNewEntry(Child child);
    boolean charge(double amount , CreditCard creditCard);
}
