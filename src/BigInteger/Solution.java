package BigInteger;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        for (BigInteger bigInteger : Arrays.asList(a.add(b), a.multiply(b))) {
            System.out.println(bigInteger);
        }
    }
}
