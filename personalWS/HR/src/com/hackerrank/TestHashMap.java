package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestHashMap {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int countPair =0;
        Map<Integer,Integer> stockCount =new HashMap<>();
        for (int i =0;i<n;i++){
            Integer num = ar[i];
            if(stockCount.containsKey(num)){
                Integer value = stockCount.get(num);
                value++;
                stockCount.put(num,value);
            }
            else
            {
                stockCount.put(num,1);
            }
        }

        Set<Integer> keys = stockCount.keySet();
        for(Integer key: keys){
            Integer value = stockCount.get(key);
            countPair = countPair + (value /2);
        }
        return countPair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
        //bufferedWriter.write(String.va
        //lueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}


