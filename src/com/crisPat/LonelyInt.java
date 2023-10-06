package com.crisPat;

import java.util.List;

public class LonelyInt {
    public static int lonelyInteger(List<Integer> a) {
        int count = 0;

            for(int i = 1; i < a.size(); ++i){
                for (int j = 0; j < a.size(); ++j){
                    if(a.get(i).equals(a.get(j))){
                        count++;
                    }
                }
                if (count == 1){
                    return a.get(i);
                }
                count = 0;
            } return a.get(0);

        }
    }
