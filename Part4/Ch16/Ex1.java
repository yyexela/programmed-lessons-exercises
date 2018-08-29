import java.util.Scanner;
import java.text.*;

class Ex1 {
	public static void main(String[] vars){
		Scanner scan = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat ("0");
		
		System.out.println("Enter cost of purchases in cents:");
		
		int cost = scan.nextInt();
		int discount;
		String discountStr;
		String costStr;
		
		
		if(cost>1000){
			discount = cost - (cost / 10);
			discountStr = numform.format(discount);
			
			System.out.println("Discounted price: " + discountStr);
		} else {
			costStr = numform.format(cost);
			System.out.println("Price: " + costStr);
		
		}
		
		
	}
}
