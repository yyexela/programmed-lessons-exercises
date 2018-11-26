public class PhoneBookTester{
    public static void main ( String[] args ){
        PhoneBook pb = new PhoneBook();  
    
        // search for "Violet Smith"
        PhoneEntry entry = pb.search( "Violet Smith" ); 

        if ( entry != null )
        System.out.println( entry.getName() + ": " + entry.getPhone() );
        else
        System.out.println("Name not found" );

    }
}