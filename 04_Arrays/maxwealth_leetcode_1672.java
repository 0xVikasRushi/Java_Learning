public class maxwealth_leetcode_1672 {


    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int c = maximumWealth(accounts);
        System.out.println(c);
    }

    static int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for (int person = 0; person < accounts.length; person++) {
            for (int wealth = 0; wealth < accounts[person].length; wealth++) {
                sum[person] = accounts[person][wealth] + sum[person];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
        int d = Maximumindiviual(sum);
        return d;


    }

    static int Maximumindiviual(int[] arr) {
        int tempmax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (tempmax < arr[i]) {
                tempmax = arr[i];
            }

        }
        return tempmax;
    }

}


