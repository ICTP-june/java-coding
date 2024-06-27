package org.example.others;

public class IntToStringTest {

    public static void main(String[] args) {
        // 타입의 변환 (형변환) Int -> String
        int num = Integer.parseInt("123");
        String sNum = Integer.toString(num);
        String sNum2 = String.valueOf(num);
        System.out.println(num);
        System.out.println(sNum);
        System.out.println(sNum2);
    }
}
