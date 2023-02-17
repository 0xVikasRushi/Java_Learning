class boundedClass <T extends Number>{
    T[] nums;
    boundedClass(T[] k){
        nums = k;
    }
    double average(){
        double ans = 0.0;
        for (int i = 0; i < nums.length; i++) {
            ans+=nums[i].doubleValue();
        }
        return ans/nums.length;
    }
}
public class genericbounded {
    public static void main(String[] args) {
        Integer[] ans = {1,2,3,4,42909};
        boundedClass<Integer> k = new boundedClass<Integer>(ans);
        System.out.println(k.average());

    }

}
