package com.crisPat;

public class AlmostIncreasingSequence {
    public static int[] delete(int[] sequence, int indexDelete) {

        int[] newSequence = new int[sequence.length - 1 ];

        for( int i = 0, k = 0; i < sequence.length; i++){
            if(i == indexDelete){
                continue;
            }
            newSequence[k++] = sequence[i];
        }
        return newSequence;
    }

    static int sol(int[] arr) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];

        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++){
           if(arr[i] >= arr[i+1]){
               arr1 = delete(arr, i);
               arr2 = delete(arr, i+1);
           }
           a = sol(arr1);
           b = sol(arr2);
        }
        return Math.min(a, b);
    }
}

