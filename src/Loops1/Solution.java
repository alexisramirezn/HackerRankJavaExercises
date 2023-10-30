package Loops1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 0; i < 10; i++){
            System.out.println(N + " x " + (i + 1) + " = " + N * (i+1));
        }
        bufferedReader.close();
    }
}
