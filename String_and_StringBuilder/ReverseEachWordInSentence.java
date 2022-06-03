package String_and_StringBuilder;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String sen = "this is test";
        System.out.println(ReverseSen(sen));

    }
    public static String ReverseSen(String str)
    {
        String ans = "";
        int cstart =0;
        int i=0;
        for (; i < str.length() ; i++) {
            if(str.charAt(i)==' '){
                int cwordend = i-1;
                String singleword = "";
                for (int j = cstart; j<=cwordend ; j++) {
                    singleword =str.charAt(j)+ singleword;

                }
                ans += singleword + " ";
                cstart = i+1;
            }


        }
        int cwordend = i-1;
        String singleword = "";
        for (int j = cstart; j<=cwordend ; j++) {
            singleword =str.charAt(j)+ singleword;

        }
        ans += singleword;
        cstart = i+1;


        return ans;
    }
}
