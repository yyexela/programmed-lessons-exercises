import java.util.Scanner;

class Ex4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = scan.nextInt();
        boolean square = false;
        for(int a = 0; a*a <= N; a++){
            for(int b = 0; ((a * a) + (b * b)) <= N; b++){
                if((a * a) + (b * b) == N){
                    System.out.println("Perfect square of N is: " + a + "^2 + " + b + "^2");
                    square = true;
                }           
            }
        }
        if(!square){
            System.out.println(N + " is not a perfect square");
        }
        System.out.println("Program end");
    }
}