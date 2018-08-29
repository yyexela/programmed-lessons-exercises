import java.util.Scanner;
//import java.text.*;

class Ex2 {
	public static void main(String[] vars){
		Scanner scan = new Scanner(System.in);
		
		final int boltPrice = 5;
		final int nutPrice = 3;
		final int washerPrice = 1;
		int cost;
		
		System.out.println("Enter bolts amount:");
		int bolts = scan.nextInt();
		
		System.out.println("Enter nuts amount:");
		int nuts = scan.nextInt();
		
		System.out.println("Enter washers amount:");
		int washers = scan.nextInt();
		
		cost = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
		
		if((nuts >= bolts) && (washers >= bolts * 2)){
			System.out.println("Order GOOD");
		} else if (!(nuts >= bolts) && !(washers >= bolts * 2)){
			System.out.println("Not enough nuts and washers");
		} else {
			if(!(nuts >= bolts)){
				System.out.println("not enough nuts");
			}
			if(!(washers >= bolts * 2)){
				System.out.println("not enough washers");
			}
		}
		
		System.out.println("Order cost: " + cost);
	}
}
