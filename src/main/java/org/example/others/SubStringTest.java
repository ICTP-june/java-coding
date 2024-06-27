package org.example.others;

public class SubStringTest {
    public static void main(String[] args) {
        String hi = "hello 안녕하세요.";
        System.out.println(hi);
        String result1 = hi.substring(2);
        System.out.println(result1);
        String result2 = hi.substring(2, 4);
        System.out.println(result2);
        CharSequence result3 = hi.subSequence(2,4);
        System.out.println(result3);
    }
}
