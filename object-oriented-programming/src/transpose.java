public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transpose = transpose(arr);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] martix){
        int r = martix.length;
        int c = martix[0].length;
        int[][] res = new int[r][c];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                res[j][i] = martix[i][j];
            }
        }
        return res;
    }
}
