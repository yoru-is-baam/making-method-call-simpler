package replaceconstructorwithfactorymethod.afterreplace;

public class Employee {
    private int type;

    private Employee(int type) {
        this.type = type;
    }

    public static Employee create(int type) {
        Employee employee = new Employee(type);
        // do some heavy lifting.
        return employee;
    }
}
