// Problem 8: ConvertSeconds.java
public class ConvertSeconds {
    public static String convertSeconds(int seconds) {
        int days = seconds / (24 * 3600);
        seconds %= (24 * 3600);
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)";
    }

    public static void main(String[] args) {
        int seconds = 21893872;
        System.out.println(convertSeconds(seconds)); // Output: 253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)
    }
}
