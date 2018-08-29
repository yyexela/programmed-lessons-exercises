import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Type something!");
		String inData = scan.nextLine();
		
		System.out.println("You said: '" + inData + "'");
    };
};