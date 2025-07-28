package converter;

public class TimeConverter {
    public static double hourToMinutes(double hour) {
        return hour * 60.0;
    }
    public static double hourToSeconds(double hour) {
        return hour * 3600.0;
    }
    public static double minutesToHours(double min) {
        return min / 60.0;
    }
    public static double secondsToHours(double sec) {
        return sec / 3600.0;
    }
}
