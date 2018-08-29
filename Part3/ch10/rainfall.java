public class rainfall {
	public static void main(String[] args){
		System.out.println("hello world");
		int april = 12;
		int may = 65;
		int june = 26;
		int july = 38;
		
		System.out.println("Rainfall for april: " + '\t' + april);
		System.out.println("Rainfall for may: " + '\t' + may);
		System.out.println("Rainfall for june: " + '\t' + june);
		System.out.println("Rainfall for july: " + '\t' + july);
		
		double average = (april + may + june + july)/4.0;
		
		System.out.println("Average rainfall: " + '\t' + average);
		
	}
}
