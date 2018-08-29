public class ex4 {
	public static void main ( String[] args ){
	String str = new String( "Golf is a good walk spoiled." ); // create the original object
	int num = 2;
    String sub = str.substring(num); //create a new object from the original
    System.out.println("String: " + str );
	System.out.println("Subtracting " + num + " from beginning of string: " + sub );
	}
}
