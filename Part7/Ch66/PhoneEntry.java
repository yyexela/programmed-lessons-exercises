class PhoneEntry{
    private String firstName;    // name of a person
    private String lastName;    // name of a person
    private String phoneNumber;   // their phone number

    public PhoneEntry( String firstName, String lastName, String phoneNumber )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getPhoneNumber() {return phoneNumber;}
}