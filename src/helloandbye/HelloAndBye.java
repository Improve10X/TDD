package helloandbye;

public class HelloAndBye {
    public String checkWord(String name, int num) {
        if (name == null){
            return null;
        }
        if (name.equals("")) {
            return "";
        }
        else {
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
