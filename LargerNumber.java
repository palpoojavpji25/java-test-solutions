//PROBLEM 3:LargerNumber.java
public class LargerNumber {
    public static int findLarger(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(findLarger(num1, num2)); // Output: 10
    }
}
