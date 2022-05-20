package Binary_Search;

public class floor_of_number {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5,6};
        int target = 4;

        System.out.println(floor(nums,target));
    }

    static int floor(int[] nums, int target){
        int middle;
        int s = 0;
        int e = nums.length - 1;
        middle = (s + e) / 2;
        int ce=0;

        while (s <= e) {
            middle = s + (e - s) / 2;
            if(target < nums[middle]) {
                e = middle-1;
            }
            if(target > nums[middle]){
                s = middle+1;
                ce = nums[middle+1];
            }
            if(target == nums[middle]){
                return middle;
            }


        }
        return e;
    }
}
