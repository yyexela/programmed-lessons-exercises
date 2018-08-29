import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Harmonic mean of 2 numbers");
		System.out.println("Number 1: ");
		
		int x = scan.nextInt();
		
		System.out.println("Number 2: ");
		
		int y = scan.nextInt();
		
		double harmMean = 2/((1.0/x)+(1.0/y));
		
		double regularMean = (x + y)/2.0;
		
		System.out.println("Arithmetic mean: " + '\t' + regularMean);
		System.out.println("Harmonic mean: " + '\t' + '\t' + harmMean);
		
	};
};