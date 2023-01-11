package ClassWork;

import java.security.SecureRandom;

public class CodeCode {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        for (int counter = 1; counter <= 10; counter++) {
            int numbers = secureRandom.nextInt(10);
            if (counter == 4){
                continue;
            }
            System.out.printf("%2d", numbers);
            System.out.println();
        }


    }
}
