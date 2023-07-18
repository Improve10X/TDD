package greeting;

public class Greeting {
    public String setNameGreeting(String name) {
        String nameGreeting = "";
        if (name == null) {
            return null;
        }
        if (name.trim() == "") {
            return "";
        }
        nameGreeting = "hello" + " " + name + "!";
        return nameGreeting;
    }
}
