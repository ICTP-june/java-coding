package org.example.day4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Day4ProblemsTest {

    @Test
    void solution_181937() {
        Day4Problems d4p = new Day4Problems();
        int result = d4p.solution_181937(98, 2);
        assertEquals(1, result);
    }

    @Test
    void solution_181931() {
        Day4Problems d4p = new Day4Problems();
        int result = d4p.solution_181931(3
            ,4
            ,new boolean[]{true, false, false, true, true});
        assertEquals(37, result);

        int result2 = d4p.solution_181931(7
                ,1
                ,new boolean[]{false, false, false, true, false, false, false});
        assertEquals(10, result2);
    }

    @Test
    void testSolution_181841() {
        Day4Problems d4p = new Day4Problems();
        String result = d4p.solution_181841(
                new String[]{"abc", "def", "ghi"},
                "ef");
        assertEquals("abcghi", result);

        String result2 = d4p.solution_181841(
                new String[]{"abc", "bbc", "cbc"},
                "c");
        assertEquals("", result2);
    }
}