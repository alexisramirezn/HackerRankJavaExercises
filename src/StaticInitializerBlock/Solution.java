package StaticInitializerBlock;

import java.util.Scanner;

public class Solution {
    public static String error = "java.lang.Exception: Breadth and height must be positive";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if (B <= 0 || H <= 0){
            System.out.println(error);
        } else {
            System.out.println(B*H);
        }
    }
}
