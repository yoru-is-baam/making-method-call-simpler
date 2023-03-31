package replaceerrorcodewithexception.beforereplace;

public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }
}
