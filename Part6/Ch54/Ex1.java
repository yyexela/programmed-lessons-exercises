import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        long n = scan.nextLong();

        while(n >= 0){
            System.out.println("Binary:" + reverse(bits(n)) );
            System.out.println("Amount of 1's: " + oneCounter(bits(n)));
            System.out.println("Type: " + bitType(oneCounter(bits(n))));
            System.out.println("Enter n");
            n = scan.nextInt();
        }
    }

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
}