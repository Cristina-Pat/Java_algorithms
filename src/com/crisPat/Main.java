package com.crisPat;

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
        RatioOfElements.plusMinus(numbers);;
    }
}