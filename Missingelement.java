public class Missingelement {
    public static int findMissingElement(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }
    public static void main(String[] args){
        int[]arr = {1,2,3,4,6};
        int n = 6;
        int missing = findMissingElement(arr,n);
        System.out.println("Missing element is : "+ missing);
    }
    
}
