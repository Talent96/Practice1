package PersonalDetails;

public class PersonalDetailsMain {
    public static void main(String[] args) {
        PersonalDetails personalDetails = new PersonalDetails("Mark", "Memga", "Lekki", "08164309463");
        personalDetails.setFirstName("David");
        System.out.println(personalDetails.getFirstName());
        personalDetails.setLastName("Memga");
        System.out.println(personalDetails.getLastName());
        personalDetails.setLocation("Lekki");
        System.out.println(personalDetails.getLocation());
        personalDetails.setPhoneNumber("+2348164309463");
        System.out.println(personalDetails.getPhoneNumber());
        System.out.printf("My name is %s %s%nI live at %s,%nMy phone number is %s.", personalDetails.getFirstName(), personalDetails.getLastName(), personalDetails.getLocation(), personalDetails.getPhoneNumber());
    }
}
