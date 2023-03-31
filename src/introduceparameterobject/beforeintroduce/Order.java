package introduceparameterobject.beforeintroduce;

public class Order {
    private String item;
    private int quantity;
    private double price;

    public Order(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal(double taxRate, double discountRate) {
        double tax = price * quantity * taxRate;
        double discount = price * quantity * discountRate;
        return (price * quantity) + tax - discount;
    }
}
