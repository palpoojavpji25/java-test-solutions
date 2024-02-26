// PROBLEM 1 COUNTDIGITS.JAVA
public class CountDigits {
    public static int countDigits(int num) {
        num = Math.abs(num); // Handle negative numbers
        if (num == 0)
            return 1; // Zero has one digit
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = 34;
        int num2 = -7291;
        System.out.println(countDigits(num1)); // Output: 2
        System.out.println(countDigits(num2)); // Output: 4
    }
}
