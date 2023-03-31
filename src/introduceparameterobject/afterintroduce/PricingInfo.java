package introduceparameterobject.afterintroduce;

public class PricingInfo {
    private double taxRate;
    private double discountRate;

    public PricingInfo(double taxRate, double discountRate) {
        this.taxRate = taxRate;
        this.discountRate = discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
