public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int id, String name, double balance, double interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double juros = getBalance() * interestRate;
        deposit(juros);
    }

}
