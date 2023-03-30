package preservewholeobject.afterpreserve;

public class Address {
    private int zipCode;
    private int areaCode;

    public Address(int zipCode, int areaCode) {
        this.zipCode = zipCode;
        this.areaCode = areaCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getAreaCode() {
        return areaCode;
    }
}
