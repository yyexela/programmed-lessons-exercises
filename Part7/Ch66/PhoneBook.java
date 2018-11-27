class PhoneBook{
    private PhoneEntry[] phoneBook; 

    public PhoneBook(){ //constructor
        phoneBook = new PhoneEntry[ 7 ] ;

        phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
        phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
        phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
        phoneBook[3] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );
        phoneBook[4] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
        phoneBook[5] = new PhoneEntry( "Jacob", "Smith", "(321) 512-7132" );
        phoneBook[6] = new PhoneEntry( "Louis", "Smith", "(723) 712-3152" );
    }
    public PhoneEntry[] search( String firstName, String lastName ){
        PhoneEntry[] matchedEntries = new PhoneEntry[phoneBook.length];
        int count = 0;

        for ( int j=0; j < phoneBook.length; j++ ){
            if(lastName.equals("")){
                //Checks all that match FIRST NAME if LAST NAME is empty
                if ( phoneBook[j] != null && phoneBook[j].getFirstName().toLowerCase().equals( firstName.toLowerCase() ) ){
                    matchedEntries[count] = phoneBook[j];
                    count++;
                }
            } else if(firstName.equals("")){
                //Checks all that match LAST NAME if FIRST NAME is empty
                if ( phoneBook[j] != null && phoneBook[j].getLastName().toLowerCase().equals( lastName.toLowerCase() ) ){
                    matchedEntries[count] = phoneBook[j];
                    count++;
                }
            } else {
                //Checks all that match FIRST and LAST NAME
                if ( phoneBook[j] != null && phoneBook[j].getFirstName().toLowerCase().equals( firstName.toLowerCase() ) && 
                    phoneBook[j].getLastName().toLowerCase().equals( lastName.toLowerCase() ) ){
                    matchedEntries[count] = phoneBook[j];
                    count++;
                }
            }
        }

        if(matchedEntries[0] != null) return matchedEntries;
        else return null;

    }
}