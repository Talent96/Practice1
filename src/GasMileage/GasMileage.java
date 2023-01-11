package GasMileage;

import java.util.Scanner;
public class GasMileage {
     int milesDrivenCounter;
     int totalMilesDriven;
    Scanner scanner = new Scanner(System.in);
     int totalGallonUsed;
     int gallonUsedCounter;

    public void milesDriven(){
        int milesDriven = 0;
        while(milesDriven != -1){
            System.out.println("Enter milesDriven or -1 to quit");
            milesDriven = scanner.nextInt();
            totalMilesDriven +=  milesDriven;
            milesDrivenCounter++;

        }
}
    public void gallonUsed(){
        int gallonUsed = 0;
        while(gallonUsed != -1){
            System.out.println("Enter gallon used or -1 to quit");
            gallonUsed = scanner.nextInt();
            totalGallonUsed += gallonUsed;
            gallonUsedCounter++;
        }
    }
        public void averageMilesPerGallon(){
        double average = (double)totalMilesDriven / totalGallonUsed;
            System.out.printf("The average milesDriven per gallon is: %f%n", average);
        }

    }
