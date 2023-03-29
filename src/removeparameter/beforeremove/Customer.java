package removeparameter.beforeremove;

public class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(int age) {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}