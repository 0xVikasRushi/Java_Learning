package String_and_StringBuilder;
//https://leetcode.com/problems/goal-parser-interpretation/
class Goal_Parser_Interpretation_leetcode {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));

    }

    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder(command.length());
        for(int i=0;i<command.length();i++){
            if((command.charAt(i) == 'G')){
                ans.append("G");
            }
            if(command.charAt(i) =='(')
            {
                if(command.charAt(i+1) == ')'){
                    ans.append("o");
                }
                else{
                    ans.append("al");

                }


            }

        }
        return ans.toString();
    }
}

