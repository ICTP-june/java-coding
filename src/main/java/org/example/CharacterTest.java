package org.example;

public class CharacterTest {
    public static void main(String[] args) {
        // char 문자 to String으로 처리
        char a = 'a';
        String s = Character.toString(a);
        System.out.println(s);

        // 문자열의 charArray처리
        String strs = "abcde";
        char[] chars = strs.toCharArray();
        for(char c : chars){
            System.out.print(c + ","); // a,b,c,d,e,
        }
        System.out.println();
        // charArray 변경 후 3번 접근
        String str2 = "abcdefghijklmnopqrst";
        char idx3ofStr2   = str2.charAt(3);
        char idx3ofStr2_2 = str2.toCharArray()[3];
        System.out.println(idx3ofStr2); // d
        System.out.println(idx3ofStr2_2); // d
    }
}
