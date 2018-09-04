import java.util.Scanner;
//import java.text.*;

class Ex3 {
	public static void main(String[] vars){
		Scanner scan = new Scanner(System.in);
		
		int capacity;
		int percentLeft;
		int mpg;
		double milesLeft;

		System.out.println("What is the gas capacity in gallons?");
		capacity = scan.nextInt();

		System.out.println("What is the remaining percent on the gauge?");
		percentLeft = scan.nextInt();
		
		System.out.println("What is the car mpg?");
		mpg = scan.nextInt();

		milesLeft = (((capacity + 0.0) * mpg) * percentLeft / 100.0);
		System.out.println("Miles left: " + milesLeft);

		if(milesLeft < 0){
			System.out.println("ERROR, NO NEGATIVE NUMBER ALLOWED");
		} else {
			if( milesLeft >= 200 ){
				System.out.println("Safe, proceed");
			} else {
				System.out.println("Unsafe, refuel");
			}
		}

	}
}
