package integerrange;

public class IntegerRange {
    public boolean findRange(int n, int lower, int upper) {
        boolean result = false;
        if(n >= lower &&  n < upper ){
            result = true;
        }
        return result;
}
}
