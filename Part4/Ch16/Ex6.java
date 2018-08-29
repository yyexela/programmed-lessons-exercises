import java.util.Scanner;

class Ex6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double windSpeed;
		double temperature;
		double windChillIndex;
		
		System.out.println("Enter wind speed in mph:");
		windSpeed = scan.nextDouble();
		
		System.out.println("Enter temperature in F:");
		temperature = scan.nextDouble();
		
		if (windSpeed < 3){
			System.out.println("WCI = " + temperature);
		} else if (temperature > 50){
			System.out.println("WCI = " + temperature);
		} else {
			windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			System.out.println("WCI = " + windChillIndex);
		}
		
	}
}