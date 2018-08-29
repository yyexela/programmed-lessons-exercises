public class payRoll{  
	public static void main ( String[] args )  {
		long   hoursWorked;    
		double payRate, taxRate;    
		payRate = 10;
		taxRate = 0.1;
		hoursWorked = 40;
		System.out.println("Hours Worked: " + hoursWorked );
		System.out.println("pay Amount  : " + (hoursWorked * payRate) );
		System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}