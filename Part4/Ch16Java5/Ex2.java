import java.util.Scanner;

class Ex2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many N for SUM(1.0/N)?");
        int N = scan.nextInt();

        double sum = 0;
        int i = 1;

        while(i != (N + 1)){
            sum = sum + (1.0/i);
            i++;
        }

        System.out.println("Sum of 1.0/N : " + sum);
    }
}