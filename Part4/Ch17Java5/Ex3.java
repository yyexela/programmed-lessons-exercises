import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N, i = 0;
        double X, pow = 1;

        System.out.println("POWER OF A NUMBER");
        System.out.println("Formula: X^N");

        System.out.println("Input X:");
        X = scan.nextDouble();
        System.out.println("Input N (N!=0 and integer):");
        N = scan.nextInt();

        if(N > 0){
            while(i != N){
                pow = pow * X;
                i++;
            }
            System.out.println("X^N = " + pow);
        } else if(N < 0){
            while(i != N){
                pow = pow * (1.0/X);
                i--;
            }
            System.out.println("X^N = " + pow);
        } else {
            System.out.println("Enter a valid N (N>0)");
        }
    }
}