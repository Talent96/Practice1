package Practice;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] grade = new double[5];
        System.out.println("Please Enter " + grade.length + " Grades");
        double sum = 0;
        for(int i = 0; i< grade.length ; i++){
            grade[i] = input.nextDouble();
            sum += grade[i];
        }
        double average = sum / grade.length;
        System.out.printf("The average is:%f%n ",average);
        double max = grade[0];
        double min = grade[0];
        for(int i = 0; i< grade.length; i++) {
            if (grade[i] > max) max = grade[i];
        }
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < min) min = grade[i];

        }
        System.out.printf("The maximum value is:%f%n ",max);
        System.out.printf("The minimum number is:%f%n ",min);
    }

}
