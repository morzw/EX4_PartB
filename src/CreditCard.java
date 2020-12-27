public class CreditCard {
        private int number;
        private int password;

    public CreditCard(int number, int password) {
        this.number = number;
        this.password = password;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
