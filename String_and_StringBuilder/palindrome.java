package String_and_StringBuilder;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        String  ans =countWords(str);
        if(ans.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

   static String countWords(String str) {
        String ans = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

//    static String anotherapproach(String str){
//        for (int i = 0 ;i < str.length() ; i++) {
//            for (int j = str.length(); j >=0 ; j--) {
//                if(str.charAt(i)!=str.charAt(j)){
//                   return false;
//                }
//                else{
//                    i++;
//                    j--;
//                }
//
//
//            }
//
//        }
//    }
}
