package Sorting_Algorithm;
//https://leetcode.com/problems/find-the-duplicate-number/
class find_the_duplicate_number {
    public int findDuplicate(int[] nums) {
int i=0;
	    int CorrectIndex;
	    while(i<nums.length){
	       CorrectIndex= nums[i]-1;
	       if(nums[i]!=i+1){
	            if(nums[CorrectIndex]!=nums[i]){
	            swap(nums,i,CorrectIndex);
	        }
	        else{
	            return nums[i];
	        }
	      
	       }
	         else{
	            i++;
	        }
	        
	    }
        return -1;
    }
    	static void swap(int[] nums,int f, int s ){
	    int temp = nums[f];
	    nums[f] = nums[s];
	    nums[s] = temp;
	}
    
}