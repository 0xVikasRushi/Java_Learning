package Arrays;
//
import java.util.Arrays;
//working on test case but not working 2300. Successful Pairs of Spells and Potions
// not working in some test case 48/56 test case working
public class spells_and_portion {
    public static void main(String[] args) {
        int[] spells = {44141,42,42,2342,424};
        int[] potions = {8,5,8};
        int success = 414;
        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length ; i++) {
            int[] tempans = new int[potions.length];
            for (int j = 0; j < potions.length; j++) {
                tempans[j]  = potions[j] * spells[i];
            }
           ans[i] = success_checking(tempans,success);
        }
        return ans;
    }
     static int success_checking(int[] potions, long success) {
         int ans=0;
         for (int i = 0; i <potions.length; i++) {
             if(potions[i]>=success){
                 ans++;
             }
         }
         return ans;
    }
}
