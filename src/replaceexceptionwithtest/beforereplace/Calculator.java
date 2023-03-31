package replaceexceptionwithtest.beforereplace;

public class Calculator {
    public int squareRoot(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number");
        }
        return (int) Math.sqrt(x);
    }
}
