package String_and_StringBuilder;

import java.util.Arrays;

public class count_words {
    public static void main(String[] args) {
        String sen = "this is test";
        System.out.println(count(sen));

    }
    public static int count(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }

        }
        return count;
    }
}
