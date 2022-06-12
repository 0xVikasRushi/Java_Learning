package String_and_StringBuilder;

import java.util.Scanner;

//https://codeforces.com/contest/1676/problem/A
public class A_Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            if(str.length() == 6){
                int i1=Integer.parseInt(String.valueOf(str.charAt(0)));
                int i2=Integer.parseInt(String.valueOf(str.charAt(1)));
                int i3=Integer.parseInt(String.valueOf(str.charAt(2)));
                int i4=Integer.parseInt(String.valueOf(str.charAt(3)));
                int i5=Integer.parseInt(String.valueOf(str.charAt(4)));
                int i6=Integer.parseInt(String.valueOf(str.charAt(5)));

                if(i1+i2+i3==i4+i5+i6){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("N0");
            }

        }
    }
}
