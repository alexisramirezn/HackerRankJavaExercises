package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scan.nextInt());
        scan.close();

        for (int j : a) {
            System.out.println(j);
        }
    }
}
