package Arrays;

public class linearsearchrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int s = 3;
        int e = arr.length;
        System.out.println(range(arr,target,s,e));

    }

    static int range(int[] arr,int search,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == search) {
                return i;

            }

        }
        return -1;
    }
}
