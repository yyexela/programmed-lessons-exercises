import java.util.Scanner;
import java.text.*;

class Ex1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0.00");

		int express;
		String deliveryType;
		String item;
		double itemPrice;
		String dollarPrice;
		int deliveryPrice;
		double totalPrice;
		boolean error = false;
		String totalPriceStr;


		deliveryPrice = 0;
		deliveryType = "error";

		System.out.println("Delivery item: ");
		item = scan.nextLine();
		
		System.out.println("Express Delivery? (0==n, 1==y) ");
		express = scan.nextInt();

		System.out.println("Enter item price in cents: ");
		itemPrice = scan.nextInt();

		if (!(express == 1 || express == 0)){
			System.out.println("ERROR, y or n not input for express: ");
			error = true;
		}

		if (itemPrice <= 0){
			System.out.println("ERROR, INCOMPATABLE PRICE");
			error = true;
		} 
		if (itemPrice > 1000){
			System.out.println("Free Delivery, $0");
			deliveryType = "Free";
			deliveryPrice = 0;
		} 
		if (itemPrice <= 1000){
			System.out.println("Regular Delivery, $2");
			deliveryType = "Regular";
			deliveryPrice = 2;
		}

		if (express == 1){
			System.out.println("Express, + $3");
			deliveryType = "Express";
			deliveryPrice = deliveryPrice + 3;
		}

		itemPrice = itemPrice / 100.0;
		dollarPrice = numform.format(itemPrice);

		totalPrice = itemPrice + deliveryPrice;

		totalPriceStr = numform.format(totalPrice);

		if (error == false){

			System.out.println("---------------------------");

			System.out.println("Invoice:");
			System.out.println('\t' + "Item:   "  + '\t' + item);
			System.out.println('\t'  + "Price:    " + '\t' + "$" + dollarPrice);
			System.out.println('\t' + "Delivery: "  + '\t' + deliveryType + " $" + deliveryPrice);
			System.out.println('\t' + "Total: "  + '\t' + " " + '\t' + "$" + totalPriceStr);

		} else {
			System.out.println("Program Terminated");
		}
	}
}