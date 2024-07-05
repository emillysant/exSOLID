public class CreditCard implements Payment{
    @Override
    public void paymentProcess(double value) {
        System.out.println("Processing payment.. R$ "+ value + " with CreditCard" );
    }

    public CreditCard() {
    }
}
