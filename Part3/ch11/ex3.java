public class ex3 {
	public static void main ( String[] args ){
		int    len;
		String str = new String( "    boi     			" );
		String strT = str.trim();
		
		System.out.println("Original string: '" + str + "'");
		System.out.println("Trimmed string: '" + strT + "'");
	}
}