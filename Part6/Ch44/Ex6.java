import java.util.Scanner;

public class Ex6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scan.nextLine();

        while(!checkPassword(password)){
            System.out.println("Incorrect Password >:(");
            System.out.println("Enter password: ");
            password = scan.nextLine();
        }
        System.out.println("Correct Password <:)");
    }
    
    public static boolean checkPassword(String password){
        boolean failed = false;
        boolean numberExists = false;

        if(password.length() < 7) {
            failed = true;
            System.out.println("length too small");
        }

        if(password.toUpperCase().equals(password)) {
            failed = true;
            System.out.println("All uppercase");
        }

        if(password.toLowerCase().equals(password)) {
            failed = true;
            System.out.println("All lowercase");
        }

        for(int i = 0; i <= 9; i++){
            if(password.indexOf(Integer.toString(i)) != -1) numberExists = true;
        }

        if(!numberExists) {
            failed = true;
            System.out.println("No numbers");
        }
        
        if(failed == true){
            return false;
        } else return true;

    }

}