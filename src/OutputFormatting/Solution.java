package OutputFormatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            s1 = s1.concat(new String(new char[15 - s1.length()]).replace("\0", " "));
            String s2;
            if (x >= 0 && x < 10){
                s2 = "00" + x;
            } else if (x >= 10 && x < 100){
                s2 = "0" + x;
            } else {
                s2 = String.valueOf(x);
            }
            System.out.println(s1 + s2);
        }
        System.out.println("================================");

    }
}
