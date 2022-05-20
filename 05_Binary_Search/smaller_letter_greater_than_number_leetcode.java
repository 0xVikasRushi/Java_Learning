//  https://leetcode.com/problems/search-insert-position/

public class smaller_letter_greater_than_number_leetcode {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        int target = 'd';
        System.out.println(smallest(letter,target));
    }

    static char smallest(char[] nums, int target) {
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
                return nums[middle];
            }


        }
        return nums[0];
    }


}
