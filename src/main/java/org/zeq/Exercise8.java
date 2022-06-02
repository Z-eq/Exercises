package org.zeq;

import java.util.Scanner;

public class Exercise8 {

        // Kopierat från google denna var för svår!!
        public static void guessingNumberGame()
        {
            // Scanner Class
            Scanner sc = new Scanner(System.in);

            // Generate the numbers
            int number = 1 + (int)(500
                    * Math.random());

            // Given K trials
            int K = 10;

            int i, guess;

            System.out.println(
                    "A number is chosen"
                            + " between 1 to 500."
                            + "Guess the number"
                            + " within 10 trials.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println(
                        "Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    break;
                }
                else if (number > guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                }
                else if (number < guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println(
                        "You have exhausted"
                                + " K trials.");

                System.out.println(
                        "The number was " + number);
            }
        }

        // Driver Code
        public static void
        main(String arg[])
        {

            // Function Call
            guessingNumberGame();
        }
    }