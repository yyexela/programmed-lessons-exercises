import java.util.Scanner;

class Ex7{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int days;
		int seconds;
		double percentage;
		boolean error;
		error = false;
		
		
		System.out.println("Years alive: ");
		int years = scan.nextInt();
		days = years * 365;
		
		System.out.println("Months alive: ");
		int months = scan.nextInt();
		
		switch (months) {
		
			case 1: days = days + 31;
					break;
					
			case 2: days = days + 31 + 28;
					break;
					
			case 3: days = days + 31 + 28 + 31;
					break;
					
			case 4: days = days + 31 + 28 + 31 + 30;
					break;
					
			case 5: days = days + 31 + 28 + 31 + 30 + 31;
					break;
					
			case 6: days = days + 31 + 28 + 31 + 30 + 31 + 30;
					break;
					
			case 7: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31;
					break;
					
			case 8: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
					break;
					
			case 9: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
					break;
					
			case 10: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
					break;
					
			case 11: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
					break;
					
			case 12: days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
					break;
			
			default: System.out.println("ERROR, INVALID MONTHS AMOUNT");
					error = true;
					break;
		}
		
		if(error == false){
			System.out.println("Days alive: ");
			days = days + scan.nextInt();
			System.out.println("Days: " + days);
			
			seconds = days * 24 * 60 * 60;
			percentage = seconds / (2500000000.0) * 100.0;
			
			System.out.println ("Seconds alive: " + seconds);
			
			System.out.println ("Percentage of lifespan complete: %" + percentage);
			
		} else {
			System.out.println("Program Terminated");
		}	
	}
}