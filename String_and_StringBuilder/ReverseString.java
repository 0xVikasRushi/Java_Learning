package String_and_StringBuilder;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        String  ans =countWords(str);
        System.out.print(ans);
    }

    private static String countWords(String str) {
        String ans = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
