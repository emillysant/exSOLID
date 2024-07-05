public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        }
    }

    public void withdraw(double valor) {
        if (valor > 0 && valor <= balance) {
            balance -= valor;
        }
    }
}
