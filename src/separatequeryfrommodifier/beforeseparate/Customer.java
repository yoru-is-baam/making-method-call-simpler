package separatequeryfrommodifier.beforeseparate;

public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAgeAndIncrement() {
        int result = age;
        age++;

        return result;
    }
}