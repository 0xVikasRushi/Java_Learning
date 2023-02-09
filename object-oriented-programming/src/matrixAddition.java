import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = 3;
        int c1 = 3;
        int r2 = 2;
        int c2 = 3;
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new int[r1][c1];

        for (int i = 0; i < r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print (res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
