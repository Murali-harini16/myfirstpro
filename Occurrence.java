public class Occurence {
    public static int[] findOccurrence(int[]arr,int targrt){
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};

    

    }
    public static void main(String...args){
        int[]arr = {10,25,30,5,15,30,40,30};
        int target = 30;
        int[]result = findOccurrence(arr,target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
    
}
