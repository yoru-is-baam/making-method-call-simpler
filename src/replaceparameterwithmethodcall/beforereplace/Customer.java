package replaceparameterwithmethodcall.beforereplace;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public double calculateDiscount(double discountRate) {
        int customerZipCode = address.getZipCode();
        int customerAreaCode = address.getAreaCode();
        return calculateDiscount(discountRate, customerZipCode, customerAreaCode);
    }

    private double calculateDiscount(double discountRate, int zipCode, int areaCode) {
        // logic to calculate the discount based on the discount rate, zip code and area code
        return 0.0;
    }
}
