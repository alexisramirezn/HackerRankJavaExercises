package InstanceOfKeyword;

import java.util.ArrayList;
import java.util.Scanner;

interface Person {}
class Student implements Person {}
class Rockstar implements Person {}
class Hacker implements Person {}

public class Solution {
    static String count(ArrayList<? extends Person> list) {
        int a = 0, b = 0, c = 0;
        for (Person person : list) {
            if (person instanceof Student)
                a++;
            if (person instanceof Rockstar)
                b++;
            if (person instanceof Hacker)
                c++;
        }
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) list.add(new Student());
            if (s.equals("Rockstar")) list.add(new Rockstar());
            if (s.equals("Hacker")) list.add(new Hacker());
        }
        System.out.println(count(list));
    }
}
