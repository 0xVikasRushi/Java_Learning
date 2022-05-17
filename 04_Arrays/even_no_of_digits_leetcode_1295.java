package Arrays;

public class even_no_of_digits_leetcode_1295 {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        int d = findNumbers(nums);
        System.out.println(d);
    }


    public static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;

    }
    static int digits(int arrayelements){
        if(arrayelements == 0){
            return 1;
        }
       int count = 0;
        while(arrayelements!=0){
            arrayelements = arrayelements /10;
            count++;
        }
        return count;
    }

    static boolean even(int nums){
     int noofdigits = digits(nums);
     if(noofdigits%2==0){
        return true;
     }
     return false;
    }
}

