public class quadMethod {
	public static void main(String[] args){
		
		
		System.out.println("(X, Y)");
		System.out.println("-------");
		for (int i=-10; i<=10; i++){
			poly(i);
		}
		
	}
	
	public static void poly (int x) {
		double y = 3.0 * x * x - 8 * (x) + 4;
		System.out.println("(" + x + "," + y + ")");
	}
	
}

