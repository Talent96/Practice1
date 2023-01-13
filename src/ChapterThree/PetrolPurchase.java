package ChapterThree;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantityOfLiters;
    private double pricePerLiter;
    private double percentageDiscount;


    public PetrolPurchase(String location, String petrolType, int quantityOfLiters, double pricePerLiter, double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantityOfLiters = quantityOfLiters;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;

    }
    public void setLocation(String location){
        this.location = location;
    }
    public void getLocation(){
        System.out.printf("The location is: %s%n", location);

    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public void getPetrolType(){
        System.out.printf("The petrol type is: %s%n", petrolType);
    }
    public void setQuantityOfLiters(int quantityOfLiters){
        this.quantityOfLiters = quantityOfLiters;
    }

    public void getQuantityOfLiters() {
        System.out.printf("The quantity Of Liters is: %d%n", quantityOfLiters);
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }

    public void getPricePerLiter() {
        System.out.printf("The price per liter is: %.2f%n", pricePerLiter);
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }

    public void getPercentageDiscount() {
        System.out.printf("The percentage discount is: %.2f%n", percentageDiscount);

    }
    public void netPurchaseAmount(){
        double netPurchaseAmount = (quantityOfLiters * pricePerLiter) - percentageDiscount;
        System.out.printf("Net purchase amount is: %.2f%n", netPurchaseAmount);

    }
}

