import java.util.Scanner;

public class PhoneBookTester{
    public static void main ( String[] args ){
        Scanner scan = new Scanner(System.in);

        PhoneBook pb = new PhoneBook();  
    
        String firstName = askUser("First name?", scan);
        String lastName = askUser("Last name?", scan);

        PhoneEntry[] searchResults;

        while(!(firstName.equals("quit")) && !(lastName.equals("quit")) ){

            searchResults = pb.search(firstName, lastName);

            if ( searchResults != null ){
                for(int i = 0; i < searchResults.length; i++){
                    if(searchResults[i] != null){
                        System.out.println(searchResults[i].getFirstName() + " " + searchResults[i].getLastName() + ": " + searchResults[i].getPhoneNumber()) ;
                    }
                }
                System.out.println("");
            }else{
                System.out.println("Name not found" + '\n');
            }
            
            firstName = askUser("First name?", scan);
            lastName = askUser("Last name?", scan);

        }

        System.out.println("Good-Bye");

    }

    private static String askUser(String question, Scanner scan){
        System.out.println(question);
        String name = scan.nextLine();
        if(name.length() > 0){
            name = name.toLowerCase();
        }
        return name;
    }
}