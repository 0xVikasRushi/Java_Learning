package Binary_Search;
//https://leetcode.com/problems/valid-perfect-square/
public class vaild_perfect_square {
    public static void main(String[] args) {
        isPerfectSquare(232332);
    }
    public static boolean isPerfectSquare(int num) {
        int start=0;
        int end = num;



        while(start<=end){
            long middle = start + (end-start)/2;
            if(middle*middle<num){
                start = (int)middle +1;
            }
            else if (middle*middle>num){
                end = (int)middle -1;
            }
            if(middle*middle==num){
                return true;
            }
        }

        return false;
    }
}
