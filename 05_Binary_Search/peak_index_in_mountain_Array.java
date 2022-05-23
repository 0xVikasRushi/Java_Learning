package Binary_Search;
///https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peak_index_in_mountain_Array {
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,0,1,2};
        System.out.print(peakIndexInMountainArray(nums));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int middle;

        while(start<end){
            middle = start + (end-start)/2;
            if(arr[middle] < arr[middle+1]){
                start = middle+1;
            }

            else if  (arr[middle] > arr[middle+1]){
                end = middle;
            }


        }
        return start;
    }
}

