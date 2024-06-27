package org.example.day4;

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/{number}
* {number} = solution_{number}
* */
public class Day4Problems {
    public int solution_181937(int num, int n) {
        // 98 이 2 의 배수이면 1 아니면 0
        return num % n == 0? 1 : 0;
    }

    public int solution_181931(int a, int d, boolean[] included) {
        int[] nums = new int[included.length];
        int next = a;
        int result = 0;
        for(int i = 0; i < included.length; i++){
            nums[i] = next;
            next += d;
            if(included[i]){
                result += nums[i];
            }
        }
        return result;
    }
}
