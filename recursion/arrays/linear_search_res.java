package recursion.arrays;

public class linear_search_res {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 0;
        System.out.println(linear(nums,32,0));
    }
    static int linear(int[] nums,int target,int index){
        if(nums.length-1== index){
            return -1;
        }
       if(nums[index] == target){
           return index;
       }
       else{
           return  linear(nums,target,index+1);
       }
    }
}
