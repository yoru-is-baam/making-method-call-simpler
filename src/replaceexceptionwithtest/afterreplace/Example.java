package replaceexceptionwithtest.afterreplace;

public class Example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (-1 < 0) {
            System.out.println("Cannot take square root of negative number");
        } else {
            int result = calculator.squareRoot(-1);
            System.out.println(result);
        }
    }
}
