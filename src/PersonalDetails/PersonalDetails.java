package PersonalDetails;

public class PersonalDetails {
    private String firstName;
    private String lastName;
    private String location;
    private String phoneNumber;
    public PersonalDetails(String firstName, String lastName, String location, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.phoneNumber =  phoneNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
