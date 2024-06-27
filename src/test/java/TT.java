import org.example.others.P181943;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TT {
    @Test
    public void pTest(){
        String a = "abc";
        int sum = 1+2;

        assertThat(a, is("abc"));
        assertThat(sum, is(3));
    }

    @Test
    public void p181943_test(){
        String result = P181943.solution("aaaaaa"
                ,"bbb"
                ,3);
        assertThat(result, is("aaabbb"));
    }


}
