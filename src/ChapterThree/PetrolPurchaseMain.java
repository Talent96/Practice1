package ChapterThree;

public class PetrolPurchaseMain {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("lekki", "AGP", 20, 150,0.05);
        petrolPurchase.getLocation();
        petrolPurchase.getPetrolType();
        petrolPurchase.getPricePerLiter();
        petrolPurchase.getQuantityOfLiters();
        petrolPurchase.getPercentageDiscount();
        petrolPurchase.netPurchaseAmount();
    }
}
