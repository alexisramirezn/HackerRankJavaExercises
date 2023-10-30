package DateAndTime;

import java.io.*;
import java.util.Calendar;
import java.util.Locale;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month -1, day);
        String s = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res); // Print the result to the console

        bufferedReader.close();
    }

}
