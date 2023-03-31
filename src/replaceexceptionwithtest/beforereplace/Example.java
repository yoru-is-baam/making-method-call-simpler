package replaceexceptionwithtest.beforereplace;

public class Example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int result = calculator.squareRoot(-1);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
