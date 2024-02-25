// problem 2: ComputeGrossPrice.java
public class ComputeGrossPrice {
    public static double computeGrossPrice(double netPrice, double taxRate) {
        return netPrice / (1 + taxRate);
    }

    public static void main(String[] args) {
        double[][] testData = {
            {99.95, 0.12},
            {49999.00, 0.28},
            {720.00, 0.05},
            {45.00, 0.00}
        };

        for (double[] data : testData) {
            double netPrice = data[0];
            double taxRate = data[1];
            System.out.println(computeGrossPrice(netPrice, taxRate));
        }
    }
}
