package com.crisPat;

public class TimeConversion {
        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

    public static String timeConversion(String s) {

        if(s.substring(8, 9).equals("A")){
            if(s.substring(0,2).equals("12")){
                    return "00" + s.substring(2,8);
            }
                return s.substring(0, 8);
        } else {
                String pmFormat = s.substring(0, 2);
                int pmInt = Integer.parseInt(pmFormat);
                int pmH = pmInt + 12;
                String pmHS = Integer.toString(pmH);
                if(pmH == 24){
                    return "12" + s.substring(2,8);
                }
                return pmHS + s.substring(2,8);
        }
    }
}
