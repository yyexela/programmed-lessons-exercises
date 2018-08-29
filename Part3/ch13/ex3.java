import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	
		System.out.println("Log base 2 of what? ");
		double x = scan.nextDouble();
		
		double y = Math.log(x) / Math.log(2);
		
		System.out.println("Log base 2 of " + x + " is " + y);
	};
};