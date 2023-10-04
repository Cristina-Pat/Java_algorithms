package com.crisPat;

public class RatioOfElements {

    /*
     * Calculate the ratios of elements that are positive, negative and zero in
     * given array.
     *
     * The function accepts an array arr as parameter.
     */

    public static void plusMinus(int[] arr) {

        int countPos = 0;
        int countNeg = 0;
        int zero = 0;

        for (Integer i: arr){
            if (i > 0 ) {
                countPos += 1;
            } else if (i == 0) {
                zero += 1;
            } else {
            countNeg+= 1;
            }
        }

        System.out.println();

        float ratioP = countPos / (float)(arr.length);
        System.out.printf("%.6f", ratioP);
        System.out.println();
        float ratioN = countNeg / (float)(arr.length);
        System.out.printf("%.6f", ratioN);
        System.out.println();
        float ratioZ = zero/(float) (arr.length);
        System.out.printf("%.6f", ratioZ);
    }
}
