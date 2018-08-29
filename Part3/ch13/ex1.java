import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Appliance kilowatt-hour cost (in cents)");
		double centsPerHour = scan.nextDouble();
		
		System.out.println("Kilowatt-hours used per year");
		double hours = scan.nextDouble();
		
		System.out.println("Annual Cost: " + ((centsPerHour/100) * hours) + " dollars" );
    };
};