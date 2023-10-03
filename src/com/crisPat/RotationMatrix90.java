package com.crisPat;

public class RotationMatrix90 {

    static void rotateMatrix90D (int[][] matrix1, int [][] matrix2){
        for (int i = 0; i < matrix1.length; ++i){
            for (int j = 0; j < matrix1[i].length; ++j){
                int a = matrix1[i][j];
                matrix2[j][matrix2.length - 1 - i] = a;
            }
        }
        for (int i = 0; i < matrix2.length; ++i){
            for (int j = 0; j <matrix2.length; ++j){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
