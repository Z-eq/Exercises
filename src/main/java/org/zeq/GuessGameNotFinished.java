package org.zeq;

import java.util.Random;
import java.util.Scanner;

public class GuessGameNotFinished {


    public static void main(String[] args ) {

        Random random = new Random();
        int x = random.nextInt(500) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1-500:");
        int guess = input.nextInt();

        if(guess >=x) {
            System.out.println("Your guess was right");
        } else

        if(guess <=x);
            System.out.println("Your guess was to low");

        System.out.println("Guess a number between 1-500:");



        //  System.out.println(x);

    }
}

