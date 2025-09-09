public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return index if found
            }
        }
        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 15};
        int target = 5;

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
