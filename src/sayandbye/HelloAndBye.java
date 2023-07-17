package sayandbye;

public class HelloAndBye {
    public String checkNumber(String name, int num) {
        if (name.equals(" ")) {
            return "Give name";
        } else {
            if (num == 0) {
                return "Bye" + " " + name.substring(0, 1).toUpperCase() + name.substring(1);
            } else if (num == 1) {
                return "Hello" + " " + name.substring(0, 1).toUpperCase() + name.substring(1);
            } else {
                return "Invalid Text";
            }
        }
    }
}
