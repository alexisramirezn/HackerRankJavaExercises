package BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        //Comparator for sorting BigDecimal strings in descending order.
        Arrays.sort(s, Comparator.comparing(BigDecimal::new, Comparator.reverseOrder()));

        //Output
        for (int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }
}
