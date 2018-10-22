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
        //checks for length and capitalization
        if( password.length() < 7 || 
            password.toUpperCase().equals(password) ||
            password.toLowerCase().equals(password)){
            return false;
        } else {
            //if length and capitalization are good, checks for a number
            for(int i = 0; i <= 9; i++){
                if(password.indexOf(Integer.toString(i)) != -1) return true;
            }
            //no number means false
            return false;
        }
    }
}