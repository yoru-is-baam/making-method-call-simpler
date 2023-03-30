package replaceparameterwithmethodcall.afterreplace;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public double calculateDiscountPublic(double discountRate) {
        return calculateDiscount(discountRate);
    }

    private double calculateDiscount(double discountRate) {
        int zipCode = address.getZipCode();
        int areaCode = address.getAreaCode();
        // logic to calculate the discount based on the discount rate, zip code and area code
        return 0.0;
    }
}
