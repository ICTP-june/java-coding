package org.example.others;

public class MethodTest {
    public static void main(String[] args) {
        String aa = getStr("string값");
        System.out.println(aa);

        System.out.println(getStr("string값222222"));
    }

    private static String getStr(String s) {
        return s;
    }
}
