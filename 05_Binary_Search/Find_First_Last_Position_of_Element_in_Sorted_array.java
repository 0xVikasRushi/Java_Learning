//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/



import java.util.Arrays;

public class Find_First_Last_Position_of_Element_in_Sorted_array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    public static int[] searchRange(int[] nums , int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = range(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = range(nums, target, false);
        }
        return ans;
    }
    public static int range(int[] nums, int target , boolean firstRange) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;


        while (s <= e) {

            int middle = s + (e - s) / 2;
            if(target < nums[middle]) {
                e = middle-1;
            }
            else if(target > nums[middle]){
                s = middle+1;
            }
            else{
                ans = middle;
                if(firstRange){
                    e = middle -1;
                }
                else{
                    s = middle +1;
                }

            }
        }


        return ans;
    }

    }


//



