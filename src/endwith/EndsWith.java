package endwith;

public class EndsWith {
    public Boolean findSuffix(String originalText, String suffix) {
        boolean result = false;
        if (originalText == null || suffix == null){
            return false;
        }else if (originalText.endsWith(suffix)){
            return true;
        }
        return result;
    }
}

