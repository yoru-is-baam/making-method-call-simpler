package preservewholeobject.beforepreserve;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public boolean isWithinDeliveryRange(Restaurant restaurant) {
        int customerZipCode = address.getZipCode();
        int customerAreaCode = address.getAreaCode();
        return restaurant.isWithinDeliveryRange(customerZipCode, customerAreaCode);
    }
}
