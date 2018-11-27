import java.util.Scanner;

public class PhoneBookTester{
    public static void main ( String[] args ){
        Scanner scan = new Scanner(System.in);

        PhoneBook pb = new PhoneBook();  
    
        String name = askName(scan);
        PhoneEntry entry = pb.search(name);
        while(!(name.equals("quit")) ){
            if ( entry != null )
            System.out.println( "The number is: " + entry.getPhone() );
            else
            System.out.println("Name not found" );
            name = askName(scan);
            entry = pb.search(name);
        }
        System.out.println("Good-Bye");
    }

    private static String askName(Scanner scan){
        System.out.println("Name? (\'quit\' to quit)");
        String name = scan.nextLine();
        if(name.length() > 0){
            name = name.toLowerCase();
        }
        return name;
    }
}