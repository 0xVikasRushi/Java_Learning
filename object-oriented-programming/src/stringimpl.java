public class stringimpl {
    public static void main(String[] args) {
        String str = "     this is new mf *    ";
        String str1 = "     this is new mf *    ";
        System.out.println(str.equals(str1));
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.substring(2,6));
        System.out.println(str.trim());
        System.out.println(str.replace(" " , "*"));

    }
}