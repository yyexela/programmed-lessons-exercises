import java.text.*;

class Ex1{
    public static void main(String[] args) {

        DecimalFormat numform = new DecimalFormat("0");

        int years = 25;
        double power = 1.0;
        double N = 20;

        System.out.println("After 0 years, there are 20 sheep");

        for(int i = 1; i <= years; i++){
            power = power * 0.83;
            N = 220 / (1 + 10 * power);
            if(N > 80){
                System.out.println("After " + i + " year(s), there are 80 sheep");
            } else {
                System.out.println("After " + i + " year(s), there are " + numform.format(N) + " sheep");
            }
        }
        
    }
}
