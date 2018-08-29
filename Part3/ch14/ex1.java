import java.util.Scanner;
import java.text.*;

class ex1 {
    public static void main(String[] args) {
		System.out.println("Degrees" + '\t' + '\t' + "radians" + '\t' + '\t' + "sine" + '\t' + '\t' + "cosine");
		System.out.println("------" + '\t' + '\t' + "------" + '\t' + '\t' + "------" + '\t' + '\t' + "------");
		
		int degrees;
		double radians;
		double sin;
		double cos;
		
		degrees = -90;
		

		for(int i=1; i<=13; i++){
			radians = degrees * Math.PI / 180;
			sin = Math.sin(radians);
			cos = Math.cos(radians);
			
			DecimalFormat numform = new DecimalFormat("0.000000");
			
			String sinString = numform.format(sin);
			String cosString = numform.format(cos);
			String radiansString = numform.format(radians);
			
			System.out.println(degrees + " " + '\t' + '\t' + radiansString + " " + '\t' + sinString + " " + '\t'  + cosString);
			degrees += 15.0;
		};
		
    };
};