package org.example.mapexample;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        // 집어넣기
        map.put("id", "jhjeongid");
        map.put("pw", "myPassword");
        map.put("email", "jhjeong@gmail.com");
        map.put("description", "this is description");
        // 가지고오기
        System.out.println(map.get("pw")); // myPassword
        // map에서 key값이 존재하나?
        System.out.println(map.containsKey("email")); // true
        // map에서 value가 존재하나?
        System.out.println(map.containsValue("jhjeong@gmail.com")); // true
        // map에서 해당 키 삭제
        System.out.println(map.remove("description", "this is descrip")); // false
        System.out.println(map.remove("description", "this is description")); // true
        // map의 길이
        System.out.println(map.size()); // 3

        System.out.println(map.keySet()); // [pw, id, email]

        // 전체 가져오기
        for(String key : map.keySet()){
            System.out.printf("(key)%s: (value)%s", key, map.get(key));
        }
    }
}
