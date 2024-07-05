public class CurrentAccount extends Account{
    private double limit;

    public CurrentAccount(int id, String name, double balance, double limit) {
        super(id, name, balance);
        this.limit = limit;
    }


    @Override
    public void withdraw(double value) {
        if (value > 0 && value <= getBalance() + limit) {
            if((getBalance() - value) < 0){
                limit += getBalance() - value;
            }
        }
        super.withdraw(value);
    }

}
