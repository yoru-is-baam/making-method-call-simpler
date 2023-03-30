package parameterizemethod.beforeparameterize;

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

    public int getAge() {
        return age;
    }

    public void incrementAgeToOne() {
        age++;
    }

    public void incrementAgeToFive() {
        age = age + 5;
    }
}
