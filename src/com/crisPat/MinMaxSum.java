package com.crisPat;

import java.util.*;

public class MinMaxSum {

    public static void miniMaxSum(int[] arr){

        System.out.println("Given list = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            for( int j = i+1; j < arr.length; j++){
                int temp = 0;
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted list = " + Arrays.toString(arr));

        int sum = 0;

        for(int i = 1; i < arr.length -1; i++){
            sum +=arr[i];
        }

        int minSum = sum + arr[0];
        System.out.println("minSum = " + minSum);
        int maxSum = sum + arr[arr.length - 1];
        System.out.println("maxSum = " + maxSum);
    }

}
