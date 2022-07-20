package code_wars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SquareN_Sum {
    public static int squareSum(int[] n) {
        int tempNum = 0;
        int sum = 0;

        if (n.length==0){
            return 0;
        }

        for (int j : n) {
            tempNum = j;
            sum += (tempNum * tempNum);
        }
        return sum;
    }

    @Test
    public void testBasic() {
        assertEquals(9, SquareN_Sum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareN_Sum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareN_Sum.squareSum(new int[]{5, -3, 4}));
        assertEquals(0, SquareN_Sum.squareSum(new int[]{}));
    }
}
