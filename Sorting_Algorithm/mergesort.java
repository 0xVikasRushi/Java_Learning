package Sorting_Algorithm;

public class mergesort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.print(maximumelement(nums));
    }
    public static int maximumelement(int[] nums){
        int tempmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(tempmax < nums[i]){
                tempmax = nums[i];
            }
        }
        return tempmax;
    }
}
