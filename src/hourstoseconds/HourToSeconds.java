package hourstoseconds;

public class HourToSeconds {
    public int findSeconds(int hours, int minutes) {
        int seconds = 0;
        seconds = hours * 3600 + minutes * 60;
        return seconds;
    }
}
