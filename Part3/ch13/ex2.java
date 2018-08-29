import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=3;i++){
			System.out.println("What is t? ");
			double t = scan.nextDouble();
			double g = 32.174;
			double x = (.5) * g * t * t;
			
			System.out.println("The object has travelled " + x + " units");
		};
	};
};