public class Sales {
    private String product;
    private  int soldAmount;
    private double totalPrice;

    public Sales(String product, int soldAmount, double totalPrice) {
        this.product = product;
        this.soldAmount = soldAmount;
        this.totalPrice = totalPrice;
    }

    public String getProduct() {
        return product;
    }

    public int getSoldAmount() {
        return soldAmount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
