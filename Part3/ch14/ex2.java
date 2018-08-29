import java.util.Scanner;
import java.text.*;

class ex2 {
    public static void main(String[] args) {
		double P;
		double r;
		double Vexp;
		double Vnum;
		double V;
		int n;
		int t;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Initial deposit:");
		P = scan.nextDouble();
		
		System.out.println("Interest rate:");
		r = scan.nextDouble();
		
		System.out.println("Years:");
		t = scan.nextInt();
		
		System.out.println("Times compounded per year:");
		n = scan.nextInt();
		
		Vexp = (n + 0.0) * t;
		Vnum = ((r + 0.0)/n + 1.0);
		
		V = P * Math.pow(Vnum, Vexp);
		
		DecimalFormat numform = new DecimalFormat ("0.00");
		
		System.out.println("Value: $" + numform.format(V));
		
    };
};

