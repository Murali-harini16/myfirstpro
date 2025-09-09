public class EvenCheck {
    public static boolean hasEven(int[]arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                return true;
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
        int[]arr = {1,4,7,9,3};
        boolean res = hasEven(arr);
        if(res){
            System.out.println("Array contains even numbers");
        }
        else{
            System.out.println("Array does not contain even numbers");
        }
    }
    
    
}
