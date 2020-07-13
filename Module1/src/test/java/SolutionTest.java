import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countEval() {
        Solution solution=new Solution();
        int expected=2;
        int actual=solution.countEval("1^0|0|1",0);
        assertEquals(expected,actual);
    }

    @Test
    public void plusOne(){
        Solution solution =new Solution();
        int[] input={1,2,3};
        int[] expected={ 1,2,4};
        int[] actual = solution.plusOne(input);

        assertArrayEquals(expected,actual);
    }
}