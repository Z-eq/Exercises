package org.zeq;

import java.util.Scanner;

public class NamInput {

        public static void main(String[] args)
        {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your name: ");
            String name = input.next();
            System.out.println("Hello "+name+"!");
        }
    }

