package Arrays;
//https://leetcode.com/problems/single-number/
public class Single_Number_I_leetcode {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        System.out.print(singleNumber(nums));
    }

    // Xor bit manipulation 2 ms	50.1 MB faster than 56.88%
    public static int singleNumber(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            res = nums[i]^res;
        }
        return res;
    }



    //my answer via linear search 409 ms	50.2 MB (5% percent faster)
//    public  int singleNumber(int[] nums) {
//        int count;
//        for(int i=0;i<nums.length;i++)
//        {
//            count=1;
//            for(int j=0;j<nums.length;j++)
//            {
//                if(nums[i]==nums[j])
//                {
//                    count++;
//                }
//            }
//            if(count==2){
//                return nums[i];
//            }
//        }
//        return -1;
//    }
}
