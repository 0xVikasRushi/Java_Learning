package recursion.arrays;

public class isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
  public boolean isPowerOfThree(int n) {
        return helper(n,0);
    }
    static boolean helper(int n , int x){
        if(n<Math.pow(2,x)){
            return false;
        }
        else if( n == Math.pow(2,x)){
            return true;
        }
        else return  helper(n,x+1);
    }
// similar questions like power 2 3 4 can be solved using this approach 
//     public static boolean isPowerOfTwo(int n, int x) {
//         if(n == Math.pow(2,x)){
//             return true;
//         }
//         return isPowerOfTwo(n,x+1);

//     }
//    public static boolean isPowerOfTwo(int n) {
//        return helper(n,0);
//    }
//
//    private static boolean helper(int n, int x) {
//        if(n == 1){
//            return true;
//        }
//        return helper(n,x+1);
//    }

}
