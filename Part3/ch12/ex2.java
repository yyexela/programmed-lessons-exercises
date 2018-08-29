import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Input amount of cents: ");
		int cents = scan.nextInt();
		
		int centsRemainder = cents % 100;
		int dollars = (cents - centsRemainder)/100;
		
		System.out.println( cents + " cents is " + dollars + " dollars and " + centsRemainder + " cents");
    };
};

