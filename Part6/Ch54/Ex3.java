import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit:");
        long max = scan.nextLong();

        for(int i = 0; i <= max; i++){
            if(isLucky(i).equals("unlucky")){
                //System.out.println(i + " is unlucky");
                if( (bitType(oneCounter(bits(i)))).equals("Evil")){
                    System.out.println(i + " is unlucky AND evil");
                }
            }
        }
        
        System.out.println("end program");
        
    }

    //Odious
    
    public static String bits(long n){
        String complete = "";
        while(n != 0){
            if(n % 2 == 1) complete = complete + "1";
            if(n % 2 == 0) complete = complete + "0";
            n = n/2;
        }
        return complete;
    }

    public static String reverse(String str){
        String complete = "";
        for(int i = str.length(); i >= 1; i--){
            complete = complete + str.substring(i-1, i);
        }
        return complete;
    }

    public static int oneCounter(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i, i+1).equals("1")) count++;
        }
        return count;
    }

    public static String bitType(int n){
        if(n % 2 == 1) { 
            return "Odious";
        }
        else{
            return "Evil";
        } 
    }

    //Unlucky and safe
    
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