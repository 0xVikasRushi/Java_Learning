package Arrays;

public class linearsearchinstring {
    public static void main(String[] args) {
        String name  = "Vikas";
        char ch = 's';
        System.out.println(Stringlinearsearch(name,ch));

    }
    static boolean Stringlinearsearch(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
