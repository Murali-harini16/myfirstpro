public class Concatenation{
    public static int[]concatenationArray(int[]arr){
        int n = arr.length;
        int [] result = new int[2*n];
        for(int i=0;i<n;i++){
            result[i] = arr[i];
            result[i+n] = arr[i];
        }
    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4};
        int[] result = concatenationArray(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}