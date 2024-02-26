// Problem 5: ComputeIncomeTax.java
public class ComputeIncomeTax {
    public static double computeTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return 0.1 * (income - 250000);
        } else if (income <= 1000000) {
            return 0.1 * (250000) + 0.2 * (income - 500000);
        } else {
            return 0.1 * (250000) + 0.2 * (500000) + 0.3 * (income - 1000000);
        }
    }

    public static void main(String[] args) {
        double[] incomes = {190000, 345000, 780000, 2400000};

        for (double income : incomes) {
            System.out.println(computeTax(income));
        }
    }
}
