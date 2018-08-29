import java.util.Scanner;
import java.text.*;

class ex3 {
    public static void main(String[] args) {
		double r;
		double t;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Interest rate:");
		r = scan.nextDouble() * 100;
		
		t = 72.0/r;
		
		DecimalFormat numform = new DecimalFormat ("0.0");
		
		System.out.println("Years needed at interest of " + r + " to double initial deposit :" + numform.format(t));
    };
};

