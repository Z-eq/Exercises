package org.zeq;

import java.util.Scanner;

public class NamInput {

        public static void main(String[] args)
        {
            Scanner input = new Scanner (System.in);
            System.out.print("Input your first name: ");
            String fname = input.next();
            System.out.println("Hello \n"+fname+"!");
        }
    }

