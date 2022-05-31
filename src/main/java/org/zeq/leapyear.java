package org.zeq;

import java.util.Scanner;
class leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        //line 9 & 10 i did take help from google
        int year = in.nextInt();
        boolean x = (year % 5) == 0;
        if (x) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " not a leap year!");
        }
    }
    //Wonder why sometimes we must write 2 closing brackets and sometimes 3?
}