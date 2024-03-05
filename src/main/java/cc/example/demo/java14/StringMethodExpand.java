package cc.example.demo.java14;

public class StringMethodExpand {
    public static void main(String[] args) {
        String str = " hello world ";
        System.out.println(str.strip());

        String str1 = "\"bezier\"";
        System.out.println(str1.translateEscapes());

        String str2 = "hello %s %d times";
        String str3 = "world";
        int times = 2;
        System.out.println(str2.formatted(str3, times));
    }
}
