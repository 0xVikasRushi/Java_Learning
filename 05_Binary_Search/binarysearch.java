package Binary_Search;

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] nums = {-22,-21,-12,-6,0,1,2,3,4,5,6};
        int target = -21;
        int ans = Binary_search(nums,target);
        System.out.println(ans);
    }

    static int Binary_search(int[] nums, int target) {
        int middle;
        int s = 0;
        int e = nums.length - 1;
        middle = (s + e) / 2;


        while (s <= e) {
            middle = s + (e - s) / 2;
            if(target < nums[middle]) {
                e = middle-1;
            }
            if(target > nums[middle]){
                s = middle+1;
            }
            if(target == nums[middle]){
                return middle;
            }

        }
        return -1;
    }
}