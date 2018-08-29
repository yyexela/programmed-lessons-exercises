import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Input circle radius (integer) for area: ");
		int inData = scan.nextInt();
		
		double area = Math.PI * inData;
		
		System.out.println("Radius: " + inData + ", Area: " + area);
    };
};