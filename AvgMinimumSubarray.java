public class AvgMinimumSubarray {
    public static double findAvgMin(int[]arr,int k){
        int minSum = Integer.MAX_VALUE;
        int wsum =0;
        for(int i=0;i<k;i++){
            wsum += arr[i];
        }
        minSum = wsum;
        for(int i=k;i<arr.length;i++){
            wsum += arr[i]-arr[i-k];
            minsum =Math.min(minSum,wsum);
        }
        return (double) minSum/k;

        }
        public static void main(String...args){
            int[]arr = {2,3,5,1,6,4};
            int k=3;
            double res = findAvgMin(arr,k);
            System.out.println("Minimum average of subarrays of size " + k + " is: " + res);
        }

    
    }
    
}
