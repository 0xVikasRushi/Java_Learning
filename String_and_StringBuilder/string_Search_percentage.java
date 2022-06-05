package String_and_StringBuilder;

public class string_Search_percentage {
    public static void main(String[] args) {
        String name = "vikass";
        char letter = 's';
        System.out.println(percentageLetter(name,letter));
    }
    public static int percentageLetter(String s, char letter) {
        int count=0;
        int n =s.length();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return (count*100)/n;
    }
}
