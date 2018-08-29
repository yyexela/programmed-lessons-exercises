import java.util.Scanner;

class Ex8{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int age;
		int time;
		
		int adultPrice = 8;
		int adultMatineePrice = 5;
		int childrenPrice = 4;
		int childrenMatineePrice = 2;
		
		int adultMinAge = 14;
		int latestMatineeTime = 1699;
		
		
		System.out.println("What is your age? ");
		age = scan.nextInt();
		
		System.out.println("Time of the 24 hour clock? (1200 is noon)");
		time = scan.nextInt();
		
		if(time <= latestMatineeTime){
			// MATINEE PRICE
			if (age <= 0){
				System.out.println("INVALID AGE");
			} else if (age < adultMinAge){
				System.out.println("Child Matinee. Price: $" + childrenMatineePrice);
			} else if (age >= adultMinAge) {
				System.out.println("Adult Matinee. Price: $" + adultMatineePrice);
			} else {
				System.out.println("Unknown Matainee Error");
			}
		} else if ( time <= 2400 && time > latestMatineeTime ){
			//REGULAR PRICE
			if (age <= 0){
				System.out.println("INVALID AGE");
			} else if (age < adultMinAge){
				System.out.println("Child Regular. Price: $" + childrenPrice);
			} else if (age >= adultMinAge) {
				System.out.println("Adult Regular. Price: $" + adultPrice);
			} else {
				System.out.println("Unknown Regular Error");
			}
		} else {
			System.out.println("INVALID TIME");
		}
		
	}
}