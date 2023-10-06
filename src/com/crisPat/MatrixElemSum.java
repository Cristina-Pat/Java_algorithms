package com.crisPat;

public class MatrixElemSum {
    static int solution(int[][] matrix) {

        int sum = 0;

        for(int j = 0; j <matrix[0].length; ++j){
            if (matrix[0][j] != 0) {
                sum+=matrix[0][j];
            }
        }

        for (int i = 1; i < matrix.length; ++i){
            for(int j = 0; j <matrix[i].length; ++j){

                if(matrix[i-1][j] != 0){
                    sum+=matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                    sum+=matrix[i][j];
                }

            }
        }
        return sum;

    }
}
