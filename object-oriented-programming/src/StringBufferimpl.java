public class StringBufferimpl {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("vikas");
        str.append("a");
        System.out.println(str);
        str.insert(3,"fds");
        str.reverse();
        System.out.println(str);
        str.replace(0, 5, "Hi");
        System.out.println(str);
        StringBuilder str1 = new StringBuilder("vikasnew");
        str.setCharAt(0,'l');
        System.out.println(str1.capacity());
        System.out.println(str);

    }
}