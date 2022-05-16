package Arrays;

public class minimum_num_array {
    public static void main(String[] args) {
        int[] array = {231,22,34,5,5,53,3,53,53,25,1};
        System.out.println(minimuminarray(array));

    }
    static int minimuminarray(int[] arr){
        int tempmin = arr[0];

        if(arr.length == 0){
            return -1;
        }
        for (int i = 1; i < arr.length ; i++) {

            if(arr[i] < tempmin){
                tempmin  = arr[i];
            }

        }
        return tempmin;
    }
}
