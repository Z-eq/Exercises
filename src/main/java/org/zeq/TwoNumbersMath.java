package org.zeq;
import java.util.Scanner;

public class TwoNumbersMath {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(input.next());
        System.out.print("Enter next number: ");
        int num2 = Integer.parseInt(input.next());
        System.out.println(num1 + num2 );    // Still could not find out how to make all in one sout or simpler?
        System.out.println(num1 * num2 );
        System.out.println(num1 / num2 );
        System.out.println(num1 - num2 );
    }
}

