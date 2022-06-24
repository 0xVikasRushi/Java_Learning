package String_and_StringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class join_method_339_A_cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = (sc.next());
        String ans[] = str.split("\\+");
        Arrays.sort(ans);
        System.out.println(String.join("+",ans));
    }
}
// RUN TIME ERROR TLE
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = (sc.next());
//        if(str.length()==1){
//            System.out.println(str);
//        }
//        else{
//            String s ="";
//            for (int i = 0; i < str.length() ; i++) {
//                if(str.charAt(i)!='+'){
//                    s+=str.charAt(i);
//                }
//            }
//            int[] arr = new int[s.length()];
//            for (int i = 0; i < s.length(); i++) {
//                arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
//            }
//            Arrays.sort(arr);
//            System.out.print(arr[0]);
//            for (int i = 1; i <arr.length ; i++) {
//                System.out.print("+"+arr[i]);
//            }
//        }
//
//
//
//    }