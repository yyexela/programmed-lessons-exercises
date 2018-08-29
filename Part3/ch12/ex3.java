import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Input amount of change as cents: ");
		int cents = scan.nextInt();
		int centsOG = cents;
		
		int centsRemainder = cents % 100;
		int dollars = (cents - centsRemainder)/100;
		
		cents = cents - (dollars * 100);
		centsRemainder = cents % 25;
		int quarters = (cents - centsRemainder)/25;
		
		cents = cents - (quarters * 25);
		centsRemainder = cents % 10;
		int dimes = (cents - centsRemainder)/10;
		
		cents = cents - (dimes * 10);
		centsRemainder = cents % 5;
		int nickels = (cents - centsRemainder)/5;
		
		cents = cents - nickels * 5;
		
		System.out.println("after nickels: " + cents + " R: " + centsRemainder);
		
		System.out.println(centsOG + " cents is " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + cents + " pennies.");
    };
};

