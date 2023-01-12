package GlobalWarming;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    Scanner input = new Scanner(System.in);
    private int correctAnswerCounter;

    public void questions(){


        System.out.println("""
                Question1: Which of the following is the name of very violent and serious types of winds which bring a lot of disaster ?
                (a) Trade winds
                (b) Hurricane
                (c) Cirrus
                (d) Stratus""");
       String userChoice = input.next();
       if (userChoice.equalsIgnoreCase("b")){
           System.out.println("Correct");
           correctAnswerCounter++;
       }else {
           System.out.println("Incorrect");
       }

        System.out.println("""
                Question2: The word Monsoon derives its name from
                (a) Arabic
                (b) Hindi
                (c) Persian
                (d) Urdu""");
        userChoice = input.next();
        if (userChoice.equalsIgnoreCase("a")){
            System.out.println("Correct");
            correctAnswerCounter++;
        }else {
            System.out.println("Incorrect");
        }

        System.out.println("""
                Question3: Which gas is likely to be reduced in the atmosphere by deforestation?
                (a) Carbon dioxide
                (b) Nitrogen
                (c) Oxygen
                (d) none of these
                """);
        userChoice = input.next();
        if (userChoice.equalsIgnoreCase("c")){
            System.out.println("Correct");
            correctAnswerCounter++;
        }else{
            System.out.println("incorrect");
        }

        System.out.println("""
                Question4: The climate of a place is not determined by
                (a) Latitude
                (b) Altitude
                (c) Longitude
                (d) Distance from sea""");
        userChoice = input.next();
        if (userChoice.equalsIgnoreCase("c")){
            System.out.println("Correct");
            correctAnswerCounter++;
        }else {
            System.out.println("Incorrect");
        }

        System.out.println("""
                Question5: Release of which will cause global warming?
                (a) Greenhouse Gases
                (b) Inert gases
                (c) SO2
                (d) Chlorine""");
          userChoice = input.next();
          if(userChoice.equalsIgnoreCase("a")){
            System.out.println("Correct");
            correctAnswerCounter++;
        }else {
            System.out.println("incorrect");

        }

        switch (correctAnswerCounter) {
            case 5 ->
                System.out.println("Excellent");
            case 4 ->
                System.out.println("Very Good");
            case 3, 2, 1 ->
                System.out.println("Time to brush up on your knowledge of global warming");

        }
    }
}