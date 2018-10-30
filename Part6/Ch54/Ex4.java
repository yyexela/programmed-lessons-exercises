import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long max = getLimit(scan);


        System.out.println("Perfect numbers:");

        /*
        //Single test
        if(isPerfect(max)) System.out.println("perfect");
        else System.out.println("is not");
        */

        
        //Multiple test
        for(long i = 2; i <= max; i++){
            if(isPerfect(i)){
                if(i >= 2){
                    System.out.println(i);
                }
            }
        }

    }

    public static long getLimit(Scanner scan){
        System.out.println("Enter upper limit:");
        return scan.nextLong();
    }

    public static boolean isPerfect(long n){
        int sumFactors = 0;
        int factorNum = 1;

        if(n > 0){
            //System.out.println("numberDivisible: 1");
            sumFactors += factorNum;
            factorNum++;
        }

        while(sumFactors <= n && factorNum < n){
            if(n % factorNum == 0){
                //System.out.println("numberDivisible: " + factorNum);
                sumFactors += factorNum;
            }
            factorNum++;
            //System.out.println("Next num:" + factorNum);
        }

        //System.out.println("sumFactors: " + sumFactors);

        if(sumFactors == n){
            return true;
        } else return false;
    }

}