package twomakesten;

public class TwoMakesTen {
    public boolean makesTen(int a, int b) {
        boolean result = false;
        int num = a;
        int number = b;
        if (num == 10 || number == 10 || num + number == 10) {
            result = true;
        }
        return result;
    }
}
