// Problem 9: SpecialInteger.java
public class SpecialInteger {
    public static boolean isSpecialInteger(int num) {
        int sumOfDigits = num / 10 + num % 10;
        int productOfDigits = (num / 10) * (num % 10);
        return sumOfDigits + productOfDigits == num;
    }

    public static void main(String[] args) {
        int num = 59;
        System.out.println(isSpecialInteger(num)); // Output: true
    }
}
