

public class Ex4{
    public static void main(String[] args) {
        int n = 28;
        int sumFactors = 0;
        int factorNum = 0;

        if(n > 0){
            System.out.println("numberDivisible: 1");
            factorNum = 2;
            sumFactors++;
        }

        while(sumFactors < n && factorNum < n){
            if(n % factorNum == 0){
                System.out.println("numberDivisible: " + factorNum);
                sumFactors += factorNum;
            }
            factorNum++;
            System.out.println("Next num:" + factorNum);
        }

        System.out.println("sumFactors: " + sumFactors);

        if(sumFactors == n){
            System.out.println("perfect");
        } else System.out.println("imperfect");


    }
}