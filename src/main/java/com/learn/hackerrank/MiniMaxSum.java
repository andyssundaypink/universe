package com.learn.hackerrank;

import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    
    public static long getMinimumSum(List<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        int size = arr.size();
        long min = 0;
        for(int i = 0; i < size-1; i++){
            min = min + arr.get(i);
        }
        return min;
    }

    public static long getMaximumSum(List<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        int size = arr.size();
        long max = 0;
        for(int i = 1; i < size; i++){
            max = max + arr.get(i);
        }
        return max;
    }
}
