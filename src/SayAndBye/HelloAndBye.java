package SayAndBye;

public class HelloAndBye {
    public String checkNumber(String name, int num) {
        String result = "";
        if (name.equals("")) {
            result = "Bye ";
        } else if (num == 0) {
            result = "Bye" + " "+ name.substring(0,1).toUpperCase() + name.substring(1);
        } else if (num == 1) {
            result = "Hello" + " " + name.substring(0,1).toUpperCase() + name.substring(1);
        } else {
            result = "Invalid";
        }
        return result;
    }
}
