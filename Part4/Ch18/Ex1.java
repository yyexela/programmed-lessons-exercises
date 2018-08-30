import java.util.Scanner;
import java.text.*;

class Ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("0.00");

        double checkingBalance;
        double savingsBalance;
        double checkFee;

        checkFee = 0.15;
        String checkStr = numform.format(checkFee);

        System.out.println("Input your current checking balance ($00.00):");
        checkingBalance = scan.nextDouble();

        System.out.println("Input your current savings balance ($00.00):");
        savingsBalance = scan.nextDouble();

        if(checkingBalance > 1000.0 || savingsBalance > 1500.00){
            System.out.println("Check fee: $0.00");

        } else if(checkingBalance < 0 || savingsBalance < 0) {
            System.out.println("ERROR, NEGATIVE BALANCE");
        } else {
            System.out.println("Check fee: $" + checkStr);
        }
    }
}