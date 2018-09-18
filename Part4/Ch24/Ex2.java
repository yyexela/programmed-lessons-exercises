import java.util.Scanner;

class Ex2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me N and I will find the sum of all odd integers 1 to N and N^2");
        int N = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= N; i+= 2){
            sum += i;
            System.out.println("Integer: " + i + " Cumulative sum: " + sum);
        }
        
        System.out.println("----------------------");
        System.out.println("Sum = " + sum + '\n' + "N^2 = " + (N * N));


    }
}