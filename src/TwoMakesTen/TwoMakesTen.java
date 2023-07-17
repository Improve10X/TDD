package TwoMakesTen;

public class TwoMakesTen {
    public boolean makesTen(int a, int b) {
        boolean result = false;
        int num1 = a;
        int num2 = b;
        if (num1 == 10 || num2 == 10 || num1 + num2 == 10) {
            result = true;
        }
        return result;
    }
}
