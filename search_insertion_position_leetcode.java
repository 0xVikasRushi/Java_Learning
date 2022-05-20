//  https://leetcode.com/problems/search-insert-position/
package Binary_Search;

public class search_insertion_position_leetcode {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int ans = searchInsert(nums,target);
        System.out.println(ans);

    }

    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length -1;
        int middle = 0;


        while(start<=end){
            middle = start + (end-start)/2;
            if(target<nums[middle]){
                end= middle-1;
            }
            if(target>nums[middle]){
               start= middle+1;
            }

            if(target == nums[middle]){
                return middle;
            }
        }
//       System.out.println(start + " " + middle + " " + end);
        return start;
    }
}
