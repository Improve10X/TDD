package HoursToSeconds;

public class HourToSeconds {
    public int findSeconds(int x, int y) {
        int result = 0;
        result = x * 60 * 60 + y * 60;
        return result;
    }
}
