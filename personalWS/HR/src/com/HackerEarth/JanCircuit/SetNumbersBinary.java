package com.HackerEarth.JanCircuit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SetNumbersBinary {
    public static void main(String args[]) throws Exception{
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseInt = Integer.parseInt(br.readLine());
        for(int i = 0;i< testCaseInt;i++) {
            int number = Integer.parseInt(br.readLine());
            int numberBitCount = Long.bitCount(number);
            String numberBinary = Integer.toBinaryString(number);
            String maxBit = numberBinary.replace("0", "1").substring(0, numberBinary.length() - 1);
            if(maxBit.contains("1") ){
                int maxNumber = Integer.parseInt(maxBit, 2);

                System.out.println(maxNumber);
            } else {
                throw NumberFormatException();
            }

        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseInt = Integer.parseInt(br.readLine());
        for(int i = 0;i< testCaseInt;i++) {
            int N = Integer.parseInt(br.readLine());
            if(N <=2){
                System.out.println(1);
            } else
            if(N == 3){
                System.out.println(3);
            }
            else{
                String NBinary = Integer.toBinaryString(N);
                String maxBit = NBinary.replace("0", "1");
                maxBit = maxBit.substring(0, NBinary.length() - 1);
                int maxNumber = Integer.parseInt(maxBit, 2);
                System.out.println(maxNumber);

            }


        }
        /*System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.bitCount(3));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.bitCount(2));*/



    }
}
