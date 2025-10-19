public class Main {

    public static void main() {
        int[] array = new int[]{1, 3, 2, 5, 4};

        //1
        int max = ArrayCalculator.findMax(array);
        System.out.println("Max = " + max);

        //2
        int min = ArrayCalculator.findMin(array);
        System.out.println("Min = " + min);

        //3
        int maxSum = ArrayCalculator.findMaxSum(array);
        System.out.println("Max sum = " + maxSum);
    }
}