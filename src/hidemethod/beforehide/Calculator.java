package hidemethod.beforehide;

public class Calculator {
    private double result;

    public void add(double a, double b) {
        result = a + b;
        printResult();
    }

    public void printResult() {
        System.out.println("Result: " + result);
    }
}
