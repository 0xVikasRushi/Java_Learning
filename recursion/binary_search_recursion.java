package recursion;

public class binary_search_recursion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7};
        int target = 7;
        System.out.println(search(nums,target,0,nums.length-1));

    }
    static int search(int[] nums,int target,int start,int end){

        if(start > end){
            return -1;
        }
        int middle = start + (end-start)/2;
        if(nums[middle] == target){
            return middle;
        }
        if(nums[middle]>target){
            search(nums,target,start,middle-1);
        }
       return  search(nums,target,middle+1,end);
    }
}
