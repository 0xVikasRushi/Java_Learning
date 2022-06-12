package String_and_StringBuilder;
//https://leetcode.com/submissions/detail/720257838/
public class strong_password_II {
    public static void main(String[] args) {
        String name = "@Aa1a1a1";
        System.out.println(name.length());
        System.out.println(strongPasswordCheckerII(name));
    }


    public static boolean strongPasswordCheckerII(String password) {
        String special = "!@#$%^&*()-+";
        if(password.length()>=8){
            int c1=0,c2=0,c3 =0,c4=0;
            for (int i = 0; i <password.length()-1 ; i++) {
                if(password.charAt(i)==password.charAt(i+1)){
                    return false;

                }
            }
            for (int i = 0; i < password.length(); i++) {

                if(password.charAt(i)>= 'A' && password.charAt(i)<='Z'){
                    c1++;
                }
                if(password.charAt(i)>= 'a' && password.charAt(i)<='z'){
                    c2++;
                }
                if(password.charAt(i)>= '0' && password.charAt(i)<='9'){
                    c3++;
                }
                for (int j = 0; j < special.length(); j++) {
                    if(password.charAt(i)==special.charAt(j)){
                        c4++;
                    }
                }

                if(c1>0&&c2>0&&c3>0&&c4>0){
                        return true;
                }

            }

        }
        return false;
    }
}
