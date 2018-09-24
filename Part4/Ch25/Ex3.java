import java.util.Scanner;

class Ex3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper limit: ");
        int max = scan.nextInt();

        int triangle = 0;
        int square = 0;

        for(int a = 1; square <= max; a++){
            square = a * a;
            for(int b = 1; triangle <= square; b++){
                triangle = triangle + b;
                //System.out.println("a is " + a + " b is " + b + " square is " + square + " triangle is " + triangle);
                if(triangle == square){
                    System.out.println((a*a) + " is a triangle and a square number");
                }
            }
            triangle = 0;
        }
    }
}