package com.crisPat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Palindrom.checkPalindrom("abcbc");
        // Palindrom.checkPalindrome2("catac");
        // Palindrom.checkPalindrome2("catafc");

        int[][] numb = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] newNumb = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
        //RotationMatrix90.rotateMatrix90D(numb, newNumb);

        int[] pages = {1, 0, 5};
        int[] chapters = {0, 3};
        //System.out.println(MakeArrayConsecutive.missingElements(pages));
        //System.out.println(MakeArrayConsecutive.missingElements(chapters));

        int[] numbers = { -4, 3, -9, 0, 4, 1};
        //RatioOfElements.plusMinus(numbers);;

        int[] sequence1 = {1, 2, 1, 2};
        int[] seq2 = {0, -2, 6, 5};
        int[] seq3 = {1, 3, 2};
        int[] seq4 = {1, 3, 2, 1};
        int[] seq5 = {10, 1, 2, 3, 4, 5};
        // AlmostIncreasingSequence.sol(sequence1);
        // System.out.println();
        // AlmostIncreasingSequence.sol(seq2);
        // System.out.println();
        // AlmostIncreasingSequence.sol(seq3);
        // System.out.println();
        // AlmostIncreasingSequence.sol(seq4);

        int[] s1 = {1, 3, 2, 4, 5};
        //System.out.println(Arrays.toString(s1));
        //System.out.println(Arrays.toString(AlmostIncreasingSequence.delete(seq3, 2)));
        MinMaxSum.miniMaxSum(s1);
    }
}