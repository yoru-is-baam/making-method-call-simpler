package renamemethod.beforerename;

public class Main {
    public static void main(String[] args) {
        Customer c2 = new Customer("Kiet", "Hoang", 21);

        System.out.println(c2.getFn());
        System.out.println(c2.getLn());
        System.out.println(c2.getA());
    }
}
