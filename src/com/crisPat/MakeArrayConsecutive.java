package com.crisPat;

public class MakeArrayConsecutive {
    static int missingElements(int[] pages) {

        int max = pages[0];
        int min = pages[0];

        for (int i = 0; i < pages.length; i++ ) {
            if (max < pages[i]){
                max = pages[i];
            }

            if (min > pages[i]){
                min = pages[i];
            }
        }

        int x = (max - min) + 1 - pages.length;
        return x;
    }

}
