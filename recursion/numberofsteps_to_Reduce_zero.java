package recursion;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class number0fsteps_reduce_to_zero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return helper(num , 0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2==0){
           return helper(num/2,count+1);
        }
        else
          return  helper(num-1,count+1);


    }
}

