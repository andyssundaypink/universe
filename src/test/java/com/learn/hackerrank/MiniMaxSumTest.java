package com.learn.hackerrank;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MiniMaxSumTest {
    
    @Test
    public void getMinMaxSumTest(){
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        long min = MiniMaxSum.getMinimumSum(list);
        assertEquals(16, min);

        long max = MiniMaxSum.getMaximumSum(list);
        assertEquals(24, max);
    }

    //2. test in unsorted arra
    @Test
    public void getMinMaxSum_onUnsortedArray(){
        List<Integer> list = Arrays.asList(9,5,3,7,2);
        long min = MiniMaxSum.getMinimumSum(list);
        assertEquals(17, min);

        long max = MiniMaxSum.getMaximumSum(list);
        assertEquals(24, max);
    }

    //1. test with a very large number since constraint is 10^9
    //large enough to make the output becomes long
    @Test
    public void getMinMaxSum_onVeryLargeTotal(){
        List<Integer> list = Arrays.asList(396285104,573261094,759641832,819230764,364801279);
        long min = MiniMaxSum.getMinimumSum(list);
        assertEquals(2093989309, min);

        long max = MiniMaxSum.getMaximumSum(list);
        assertEquals(2548418794L, max);
    }
}
