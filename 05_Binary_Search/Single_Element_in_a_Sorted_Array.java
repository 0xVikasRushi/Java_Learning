package Binary_Search;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }


        public static int singleNonDuplicate(int[] nums){
            int high = nums.length-1;
            int low = 0;
            int mid;

            //Boundary cases
            if(high==0)
                return nums[0];
            else if(nums[0]!=nums[1])
                return nums[0];
            else if(nums[high]!=nums[high-1])
                return nums[high];

            while(low<=high)
            {
                mid = low + (high-low)/2;
                //Unique element
                if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                    return nums[mid];

                if(((mid%2)==0 && nums[mid]==nums[mid+1])
                        ||  ((mid%2)==1 && nums[mid]==nums[mid-1]))
                    low = mid+1;
                else
                    high = mid-1;

            }
            return -1;
        }



















    //linear search O(1)
//    public static int singleNonDuplicate(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        if(nums[0] != nums[1] ){
//            return nums[0];
//        }
//        if(nums[nums.length-1] != nums[nums.length-2] ){
//            return nums[nums.length-1] ;
//        }
//
//
//        for(int i=1;i<=nums.length-2;i++){
//            if(nums[i]!=nums[i+1] && nums[i] != nums[i-1]){
//                return nums[i];
//            }
//
//
//        }
//        return -1;
//    }



}

