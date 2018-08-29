public class ex2 {
	public static void main ( String[] args ){
		int    len;
		String str = new String( "Elementary, my dear Watson!" );
		String str1 = new String( "    boi     " );
		String str2 = new String( "3tabs:			" );
		String str3 = new String( "1234" );
		len = str.length();
		System.out.println("The length of '" + str + "' is: " + len );
		len = str1.length();
		System.out.println("The length of '" + str1 + "' is: " + len );
		len = str2.length();
		System.out.println("The length of '" + str2 + "' is: " + len );
		len = str3.length();
		System.out.println("The length of '" + str3 + "' is: " + len );
	}
}