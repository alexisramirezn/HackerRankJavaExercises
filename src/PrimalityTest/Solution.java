package PrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        try {
            BigInteger number = new BigInteger(n);
            if (number.isProbablePrime(100)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.");
        }
        bufferedReader.close();
    }
}
