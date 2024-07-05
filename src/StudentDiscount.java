public class StudentDiscount extends Discount {

    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount*0.1;
    }
    @Override
    public String seniority() {
        return "Student";
    }

}
