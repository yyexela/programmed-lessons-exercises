import java.util.Scanner;

public class PhoneBookTester{
    public static void main ( String[] args ){
        Scanner scan = new Scanner(System.in);

        PhoneBook pb = new PhoneBook();  

        String option = selectOption(scan);

        while( !(option.equals("4")) ){
            switch(option){
                case "1":
                    searchName(scan, pb);
                    option = selectOption(scan);
                    break;
                case "2":
                    addEntry(scan, pb);
                    option = selectOption(scan);
                    break;
                case "3":
                    deleteEntry(scan, pb);
                    option = selectOption(scan);
                    break;
                default :
                    System.out.println("Invalid option");
                    option = selectOption(scan);
            }
        }
        System.out.println("Good-Bye");
    }

    private static void deleteEntry(Scanner scan, PhoneBook pb){
        System.out.println("Delete which index?");
        PhoneEntry[] entries = pb.getPhoneBook();
        for(int i = 0; i < pb.length(); i++){
            if(entries[i] != null){
                System.out.println(i + " : " + entries[i].getFirstName() + " " + entries[i].getLastName());
            }
        }
        System.out.println("");
        String index = scan.nextLine();
        pb.deleteEntry( index );
    }
    
    private static void addEntry(Scanner scan, PhoneBook pb){
        System.out.println("First name?");
        String firstName = scan.nextLine();

        System.out.println("Last name?");
        String lastName = scan.nextLine();

        System.out.println("Phone number?");
        String phoneNumber = scan.nextLine();

        int index = -1;

        for(int i = 0; i < pb.length(); i++){
            if(pb.isNull(i) ){
                index = i;
                break;
            }
        }
        if(index != -1){
            PhoneEntry add = new PhoneEntry(firstName, lastName, phoneNumber);
            pb.addEntry(add, index);
            System.out.println("Entry added to index " + index);
        } else System.out.println("Could not add entry, no room in phonebook" + '\n');
    }

    private static String selectOption(Scanner scan){
        System.out.println("Select option:" + '\n' + "1: Search" + '\n' + "2: Add Entry" + '\n' + "3: Delete Entry" + '\n' + "4: Exit" + '\n');
        return scan.nextLine();
    }

    private static void searchName(Scanner scan, PhoneBook pb){
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
        System.out.println("");
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