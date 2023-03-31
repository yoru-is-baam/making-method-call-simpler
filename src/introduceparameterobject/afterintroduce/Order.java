package introduceparameterobject.afterintroduce;

public class Order {
    private String item;
    private int quantity;
    private double price;

    public Order(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal(PricingInfo pricingInfo) {
        double tax = price * quantity * pricingInfo.getTaxRate();
        double discount = price * quantity * pricingInfo.getDiscountRate();
        return (price * quantity) + tax - discount;
    }
}
