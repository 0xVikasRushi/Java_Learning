import java.util.HashMap;
public class freq {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,6,7,8,9};

        int n = 5;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n) cnt++;
        }
        System.out.println(cnt);
    }
    public static int freq(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < arr.length ; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i]) + 1);
            }
        }
        return  map.get(n);
    }

}
