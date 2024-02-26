// Problem 4: FindMedian.java
public class FindMedian {
    public static double findMedian(double[] sortedArray) {
        int length = sortedArray.length;
        if (length == 0) return -1.0;
        int middle = length / 2;
        if (length % 2 == 0) {
            return (sortedArray[middle - 1] + sortedArray[middle]) / 2.0;
        } else {
            return sortedArray[middle];
        }
    }

    public static void main(String[] args) {
        double[][] testData = {
            {10.7},
            {1.0, 2.0, 3.0},
            {17.4, 21.1, 39.7, 48.0},
            {-957.0, -493.0, -384.0, -268.0, -131.0},
            {} // Empty array
        };

        for (double[] data : testData) {
            System.out.println(findMedian(data));
        }
    }
}
