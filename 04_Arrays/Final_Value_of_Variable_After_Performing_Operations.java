//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/


package Arrays;

public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {

        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }
    public static int finalValueAfterOperations(String[] operations) {
        int X= 0;
        for(String str:operations) {
            if(str.charAt(1) == '+'){
                X = X+1;
            }
            else{
                X = X-1;
            }
        }

        return X;
    }
}
