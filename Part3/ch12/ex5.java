import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Input string: ");
		String str = scan.nextLine();
		
		System.out.println("beginIndex: ");
		int beginIndex = scan.nextInt();
		
		System.out.println("endIndex: ");
		int endIndex = scan.nextInt();
		
		String sub = str.substring(beginIndex, endIndex);
		
		System.out.println("String: " + str);
		System.out.println("Substring: " + sub);
    };
};

