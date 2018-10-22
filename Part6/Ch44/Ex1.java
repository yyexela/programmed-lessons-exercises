import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        //Variables
        String oldName;
        String newName;
        int spaceLocation;

        //Scan for name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first AND last name!");
        oldName = scan.nextLine();

        //Modify string to work with the program
        newName = oldName.trim();
        System.out.println(capitalizeLastName(newName));

    }

    public static String capitalizeLastName(String name){
        int spaceLocation = name.indexOf(" ");
        String firstName = name.substring(0, spaceLocation);
        String lastName = name.substring(spaceLocation + 1, name.length());
        lastName = lastName.toUpperCase();

        if(spaceLocation >= 0){
            return firstName + " " + lastName;
        } else return "Invalid Name";
    }

}