package com.crisPat;

public class CommonCharacterCount {
    // delete the character of a string
    static String delete (String word, int indexDelete) {

        String newWord = "";

        for( int i = 0; i < word.length(); i++){
            if(i == indexDelete){
                continue;
            }
            newWord += word.charAt(i);
        }
        return newWord;
    }
    static int count = 0;
    static int solution(String s1, String s2) {

        for(int i = 0; i < s1.length(); i++){
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1 = delete(s1, i);
                    s2 = delete(s2, j);
                    count++;
                    i--;
                    break;
                }
            }
        }
        return count;
    }
}


