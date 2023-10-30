package SubstringComparisons;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String minSubstring = s.substring(0,k);
        String maxSubstring = s.substring(0,k);
        for (int i = 1; i < s.length()-k+1; i++) {
            String sub = s.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }

        return minSubstring + "\n" + maxSubstring;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
