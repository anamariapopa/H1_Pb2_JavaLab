public class ArrayCalculator {

   //1
    public static int findMax(int[] array) {
       int max = -1;
       for (int i = 0; i < array.length; i++ ) {
           if (array[i] > max) {
               max = array[i];
           }
       }
       return max;
   }

   //2
   public static int findMin(int[] array) {
       int min = Integer.MAX_VALUE;
       for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }
       }
       return min;
   }

   //3
    public static int findMaxSum(int[] array) {
        int maxSum = 0;
        int min = findMin(array);
        for ( int i = 0; i < array.length; i++ )
            maxSum += array[i];
        maxSum -= min;
        return maxSum;
    }

    //4
    public static int findMinSum(int[] array) {
        int minSum = 0;
        int max = findMax(array);
        for ( int i = 0; i < array.length; i++ )
            minSum += array[i];
        minSum -= max;
        return minSum;
    }
}
