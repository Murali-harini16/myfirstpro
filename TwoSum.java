public class TwoSum {
    public static int[] twoSum(int[]arr,int b){
        int n = arr.length;
        int l =0,r=n-1;
        while(l<r){
            int sum =arr[l]+arr[f];
            if(sum==b){
                return new int[]{l,r};

            }  
             else if(sum <b){
                l++;
             } 
            else{
                r--;  }

    }
    return new int[]{-1,-1};
}  
    
}

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int b = 9;
        int[]res = twoSum(arr,b);
        if(res[0]==-1 && res[1]==-1){
            System.out.println("No two sum solution");
        }
        else{
            System.out.println("Indices: "+res[0]+" "+res[1]);
        }
    }
