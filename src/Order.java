public class Order {
    private double value;
    private double discount;
    private String seniority;


    public Order(Discount discount, double value) {
        this.discount = discount.calculateDiscount(value);
        this.value = value;
        this.seniority = discount.seniority();
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", discount=" + discount +
                ", seniority='" + seniority + '\'' +
                '}';
    }
}
