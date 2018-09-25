import java.util.Scanner;

class Ex3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Upper limit: ");
        int max = scan.nextInt();

        if(max > 2147000000){
            System.out.println("Max value is too large, setting it to 2147000000");
            max = 2147000000;
        }
        if(max < 0){
            System.out.println("Number must be positive, setting max to 2147000000");
            max = 2147000000;
        }

        int triangle = 0;
        int square = 0;

        for(int a = 0; a*a <= max; a++){
            square = a * a;
            for(int b = 0; triangle <= square; b++){
                triangle = triangle + b;
                if(triangle == square){
                    System.out.println(square + " is a triangle and a square number");
                    //System.out.println("a is " + a + " b is " + b + " square is " + square + " triangle is " + triangle);
                }
            }
            triangle = 0;
        }
    }
}