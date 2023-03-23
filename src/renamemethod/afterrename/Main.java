package renamemethod.afterrename;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Kiet", "Hoang", 21);

        System.out.println(c1.getFirstName());
        System.out.println(c1.getLastName());
        System.out.println(c1.getAge());
    }
}
