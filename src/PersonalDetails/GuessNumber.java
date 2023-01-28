package PersonalDetails;

import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
        int number = (int) (Math.random() * 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a magic number between 0  and 5");
        int guess = 0;
        while (guess != number){
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is high");
            else
                System.out.println("Your guess is too low");
        }
    }

}

