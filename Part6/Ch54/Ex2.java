import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long n = getN(scan);

        while(n >= 0){
            System.out.println(isLucky(n));
            n = getN(scan);
        }
        
        System.out.println("end program");
        
    }
    
    public static long getN(Scanner scan){
        System.out.println("Enter n (n < 0 to exit)");
        return scan.nextLong();
        
    }

    public static String isLucky(long n){
        for(long i = n; i > 0; i = i/10 ){
            if(is13(last2(i))){
                return "unlucky";
            }
        }
        return "safe";
    }

    public static long last2(long n){
        return n % 100;
    }

    public static boolean is13(long n){
        if(n == 13) return true;
        else return false;
    }

}