import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Input voltage: ");
		int voltage = scan.nextInt();
		
		System.out.println("Input resistance: ");
		int resistance = scan.nextInt();
		
		double current = ((voltage + 0.0) / resistance);
		
		System.out.println("V: " + voltage + " R: " + resistance + " I: " + current);
    };
};

