package Nokia;

import java.util.Scanner;

public class Nokia {
    Scanner input = new Scanner(System.in);

    public String display() {
        return """
                Welcome!!!
                Enter 1 --> for phonebook
                Enter 2 --> for messages
                Enter 3 --> for call register
                Enter 4 --> for settings
                Enter 5 --> for Games
                Enter 6 --> for Extras
                """;
    }

    public void messageMenu() {
        System.out.println("""
                1 --> Create messege
                2 --> Inbox
                3 --> Outbox
                4 --> Draft
                """);
    }

    public void callRegisterMenu() {
        System.out.println("""
                1 --> Dialed numbers
                2 --> Missed calls
                3 --> Received calls
                """);
    }

    public void settings() {
        System.out.println("""
                1 --> Tone setting
                2 --> Profile setting
                3 --> Bluetooth setting
                """);
    }

    public void Games() {
        System.out.println("""
                1 --> Snake game
                2 --> Building game
                3 --> Football game
                """);
    }

    public void Extra() {
        System.out.println("""
                1 --> Calculator
                2 --> Torchlight
                3 --> Calender
                """);
    }

    public void userInput() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 2:
                messageMenu();
                break;
            case 3:
                callRegisterMenu();
                break;
            case 4:
                settings();
                break;
            case 5:
                Games();
            case 6:
                Extra();
            default:
                System.out.println("invalid Entry");
                break;
        }
        String userChoice;
        do {
            System.out.println("Do you wish to continue? Yes or No?");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("Yes")) {
                System.out.println(display());
                userInput();
            }else {
                System.exit(0);
            }
        } while (userChoice.equalsIgnoreCase("Yes"));



    }
}


