package com.crisPat;

import java.util.List;

public class DiagonalDifference {
    public static int solution(List<List<Integer>> arr) {
        int sumLtR = 0;
        int sumRtL = 0;

        for (int i = 0; i < arr.size(); i++){
            for(int j = 0; j< arr.get(i).size(); j++){
                if(i == j){
                    sumLtR+=arr.get(i).get(j);
                }
                if(j == arr.size() - 1 - i ){
                    sumRtL+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sumLtR - sumRtL) ;

    }

    public static int solution2(List<List<Integer>> arr) {
        int sumLtR = 0;
        int sumRtL = 0;

        for (int i = 0, j = arr.size()-1; i < arr.size(); i++){
            sumLtR+=arr.get(i).get(i);

            if(j == arr.size() - 1 - i){
                sumRtL+=arr.get(i).get(j);
            }
            j--;

        }
        return Math.abs(sumLtR - sumRtL) ;

    }
}
