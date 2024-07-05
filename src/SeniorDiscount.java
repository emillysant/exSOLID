public class SeniorDiscount extends Discount {

    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount*0.2;
    }

    @Override
    public String seniority() {
        return "Senior";
    }
}
