package String_and_StringBuilder;


class restoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] d = restoreString(s,indices);
        for (int i = 0; i < indices.length ; i++) {
            System.out.print(d[i]);
        }
    }
    public static char[] restoreString(String s, int[] indices) {
        char[] ans = new char[(indices.length)];
        for (int i = 0; i < indices.length-1; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return ans;
    }
//another ans
//    public String restoreString(String s, int[] indices) {
//        StringBuilder ans = new StringBuilder(s);
//        for (int i = 0; i < indices.length; i++) {
//            ans.setCharAt(indices[i],s.charAt(i));
//        }
//        return ans.toString();
//    }
}