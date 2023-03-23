package renamemethod.beforerename;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFn() {
        return firstName;
    }

    public String getLn() {
        return lastName;
    }

    public int getA() {
        return age;
    }
}
