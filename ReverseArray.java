public class ReverseArray {
    public static int [] reverseArray(int[]arr){
        int  left =0;
        int right = arr.length -1;
        while(left <  right){
            int temp = arr[left];
            arr[left] = arr[right]:
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String...args){
        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        reverseArray(arr);

        System.out.print("\nReversed Array :");
        for(int num : arr){
            System.out.print(num + "");
        }

    }
    
}

# used two pointer approach to reverse the array elemets in place
# TC : O(n)
# SC : O(1)
