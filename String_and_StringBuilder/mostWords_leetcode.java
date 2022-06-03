package String_and_StringBuilder;

class mostWords_leetcode {
    public static void main(String[] args) {
        String[] sen = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sen));
    }
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i = 0; i < sentences.length; i++) {
            int count=1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j) == ' ') {
                    count++;

                }
            }
            if(max<count){
                max = count;
            }


        }
  return max;
    }

}