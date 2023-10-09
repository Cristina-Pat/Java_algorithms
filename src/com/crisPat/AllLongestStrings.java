package com.crisPat;

public class AllLongestStrings {
    static String[] solution(String[] inputArray) {

        int max = inputArray[0].length();
        int count = 0;

        for (String item : inputArray) {
            if (item.length() >= max) {
                max = item.length();
            }
        }
        for (String value : inputArray) {
            if (value.length() == max) {
                count++;
            }
        }

        String[] newArray = new String[count];

        int j = 0;

        for (String s : inputArray) {
            if (s.length() == max) {
                newArray[j] = s;
                j++;
            }
        }
        return newArray;
    }
}
