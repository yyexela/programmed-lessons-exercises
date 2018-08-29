import java.util.Scanner;

class Ex4 {
	public static void main(String[] vars){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter contestant weight:");
		
		int weight = scan.nextInt();
		
		if(weight>220 && weight<280){
			System.out.println("Contestant is allowed");
			
		} else {
			System.out.println("Contestant not allowed");
		
		}
		
		
	}
}
