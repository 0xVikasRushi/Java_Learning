package Arrays;

import java.util.Scanner;

public class linearsearchfunc {

    public static void main(String[] args) {
        int[] nums = {2,32,4,2,52,5,543,53,25,53};
        int target = 52;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr,int search) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == search) {
                return i;

            }

        }
        return -1;
    }

}
