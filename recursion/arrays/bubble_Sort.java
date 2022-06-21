package recursion.arrays;

import java.util.Arrays;

public class bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble_sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                bubble_sort(arr,i,j+1);
            }
        }
        else bubble_sort(arr,i-1,0);

    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
