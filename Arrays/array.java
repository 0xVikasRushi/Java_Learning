package Arrays;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arrayelement = new int[5];
        arrayelement[0]=21;
        for(int i = 0 ; i<arrayelement.length;i++){
            arrayelement[i]= input.nextInt();
        }
        for (int j : arrayelement) {
            System.out.print(j + " ");
        }

    }
}
