package EndOfFile;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int line=1;
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println(line + " " + sc.nextLine());
            line++;
        }
        sc.close();
    }
}
