package String_and_StringBuilder;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/118/A?locale=en
public class join_method_cf_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String ans = "";
        for (int i = 0; i < str.length() ; i++) {
            if(!((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') ||(str.charAt(i)=='o') ||(str.charAt(i)=='u') || (str.charAt(i)=='y'))){
                ans+= "." + str.charAt(i);
            }
        }
        System.out.println(ans);

    }
}
