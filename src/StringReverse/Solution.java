package StringReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        StringBuilder b = new StringBuilder();
        char[] c = a.toCharArray();
        for (int i = c.length - 1; i >= 0; i--){
            b.append(c[i]);
        }
        if (a.contentEquals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
