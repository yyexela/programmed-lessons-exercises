import java.util.Scanner;

class Ex4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = scan.nextInt();
        int a = 0, b = 0;
        boolean square = false;
        while(a*a < N){
            while(((a * a) + (b * b)) < N){
                b++;
            }
            //System.out.println("a = " + a + " b = " + (b));
            //System.out.println("a^2 + b^2 = " + ((a * a) + (b * b)));
            if((a * a) + (b * b) == N){
                System.out.println("Perfect square of N is: " + a + "^2 + " + b + "^2");
                square = true;
            }
            b=0;
            a++;
        }
        if(!square){
            System.out.println(N + " is not a perfect square");
        }
        System.out.println("Program end");
    }
}