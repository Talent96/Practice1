package ClassWork;

import java.util.Scanner;

public class ClassAverage {
     int counter;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        System.out.println("Enter first grade or -1 to quit");
        int grade = input.nextInt();
        while (grade != -1) {
            total += grade;
            counter++;
            System.out.println("Enter next grade or -1 to quit");
            grade = input.nextInt();
        }

            if (counter != 0){
                double average = (double) total / counter;
                System.out.printf("The Average is %f%n", average);

                }
            else {
                System.out.println("No grades were entered");
            }
        }
}
