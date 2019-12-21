package com.hackerrank;

public class CountVallyProblem {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    int vallyCount = 0;
    int sealevel = 0;
    char []c = s.toCharArray();
    for(int i =0;i<c.length;i++){
       if(c[i] == 'D'){
           sealevel --;
       }
       if(c[i]=='U'){
           sealevel ++;
       }

       if(sealevel == 0){
           vallyCount++;
       }
    }
    return vallyCount
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
