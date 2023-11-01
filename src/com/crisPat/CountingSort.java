package com.crisPat;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {
    public static int[] sol1(int[] arr) {

        int count = 0;
        int[] result = new int[arr.length];
        System.out.println(result.length);

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < arr.length; j++){
                if( i == arr[j]){
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}

