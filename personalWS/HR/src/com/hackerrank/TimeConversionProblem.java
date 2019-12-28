package com.hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversionProblem {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String time="";
        if(s.contains("AM")){
            if(s.substring(0,2).equals("12")){
                time = "00"+s.substring(2,8);

            }else{
                time =s;
            }
        }else{
            if(s.substring(0,2).equals("12")){
                time = "12"+s.substring(2,8);
            }else{
                String h_str = s.substring(0,2);
                int h = Integer.parseInt(h_str);
                h = h + 12;
                time = h+s.substring(2,8);
            }
        }
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = "07:45:05PM";

        String result = timeConversion(s);
        System.out.println(result);

    }
}
