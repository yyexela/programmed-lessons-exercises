public class trig {
	public static void main(String[] args){
		double degrees = 90;
		double radians = degrees * Math.PI / 180;
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		
		System.out.println("Sine of " + degrees + " degrees = " + sin);
		System.out.println("Cosine of " + degrees + " degrees = " + cos);
		
		radians = 0.5236;
		sin = Math.sin(radians);
		cos = Math.cos(radians);
		
		System.out.println("Sine of " + radians + " radians = " + sin);
		System.out.println("Cosine of " + radians + " radians = " + cos);
		
		//double sum = Math.pow(2,sin) + Math.pow(2,cos);
		System.out.println("Sin^2 + Cos^2 of " + radians + " radians = " + (Math.pow(sin,2) + Math.pow(cos,2)));
		
		
	}
}