package com.crisPat;

public class Palindrom {

    static void checkPalindrom(String text) {
        int half = ((int) Math.floor((text.length())/2));

        String fHalf = text.substring(0, half);
        String sHalf;

        if(text.length()%2 == 0) {
            sHalf = text.substring(half);
        } else {
            sHalf = text.substring(half+1);
        }


        String reverseSHalf = "";
        char c;

        for (int i = 0; i < sHalf.length(); i++){
            c = sHalf.charAt(i);
            reverseSHalf= c + reverseSHalf;
        }

        System.out.println(fHalf.equals(reverseSHalf));
    }

    static void checkPalindrome2(String text){

        int textLength = text.length();

        boolean isPalindrome = true;

        for (int i = 0; i < textLength; i++){
            if(text.charAt(i) != text.charAt(textLength - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome == true) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}
