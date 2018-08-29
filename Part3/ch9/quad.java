public class quad {
	public static void main(String[] args){
		double x = 2.0/3;
		double y = 3 * x * x - 8 * (x) + 4;
		System.out.println("(" + x + "," + y + ")");
		
		x = 2.0;
		y = 3 * x * x - 8 * (x) + 4;
		System.out.println("(" + x + "," + y + ")");
		
		x = 0.0;
		y = 3 * x * x - 8 * (x) + 4;
		System.out.println("(" + x + "," + y + ")");
		
		x = 20.0;
		y = 3 * x * x - 8 * (x) + 4;
		System.out.println("(" + x + "," + y + ")");
		
	}

}

/*
public void poly(double x) {
	double y = Math.pow(x, 2) - 8 * (x) + 4;
	//System.out.println("(" + x + "," + y + ")");
};
*/