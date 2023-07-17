package fizzbuzz;

public class FizzBuzz {
    public String findFizzBuzz(int n) {
        String result = "";
        int num = n;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "fizzbuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }
}