package endwith;

public class EndsWith {
    public Boolean findSuffix(String originalText, String suffix) {
        if (originalText.endsWith(suffix)) {
            return true;
        } else if (originalText.endsWith(null)){
            return true;
        }else {
        }
        return false;
    }
}

