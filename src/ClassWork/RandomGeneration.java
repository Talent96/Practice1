package ClassWork;

import java.security.SecureRandom;

public class RandomGeneration {
    public static void main(String[] args) {

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        SecureRandom secureRandom = new SecureRandom();
        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + secureRandom.nextInt();
            switch (face) {
                case 1 -> frequency1++;
                case 2 -> frequency2++;
                case 3 -> frequency3++;
                case 4 -> frequency4++;
                case 5 -> frequency5++;
                case 6 -> frequency6++;


            }

        }
        System.out.println("face/frequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2,frequency3, frequency4, frequency5, frequency6);
    }
}