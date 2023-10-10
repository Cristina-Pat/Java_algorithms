package com.crisPat;

// Return the next alphabetically greater permutation string of the given string

public class NextGreaterString {

    static String solution (String s){

        char [] characters = s.toCharArray();
        String sol = "";

        char temp;

        for (int i = 2; i < characters.length; i++){
            for(int j = 1; j< characters.length; j++){
                if(characters[i] > characters[j]){
                   temp = characters[j];
                   characters[j] = characters[i];
                   characters[i] = temp;
                }
            }
        }
        for (char c: characters){
            sol = sol+c;
        }
        return sol;
    }

}
