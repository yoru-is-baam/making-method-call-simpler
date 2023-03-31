package hidemethod.afterhide;

public class Calculator {
    private double result;

    public void add(double a, double b) {
        result = a + b;
        printResult();
    }

    private void printResult() {
        System.out.println("Result: " + result);
    }
}
