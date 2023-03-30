package preservewholeobject.afterpreserve;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public boolean isWithinDeliveryRange(Restaurant restaurant) {
        return restaurant.isWithinDeliveryRange(address);
    }
}
