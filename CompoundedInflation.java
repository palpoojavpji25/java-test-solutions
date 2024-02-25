// Problem 7: CompoundedInflation.java
public class CompoundedInflation {
    public static double computeCompoundedInflation(double inflationRate, int years) {
        return Math.pow((1 + inflationRate / 100), years);
    }

    public static void main(String[] args) {
        double inflationRate = 20.0;
        int years = 5;
        System.out.println(computeCompoundedInflation(inflationRate, years));
    }
}
