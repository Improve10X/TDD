package bomb;

public class TheBomb {
    public String checkWord(String name) {
        String result = "";
        if (name == null) {
            return "null";
        }
        if (name == ""){
            return  "";
        }String textInLowerCase = name.toLowerCase();
        if (textInLowerCase.contains("bomb")) {
            result = "DUCK!";
        }
        return result;
    }
}
