import java.util.Scanner;

class Ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int value = 1;
        int sum = 0;
        int nums = 0;

        System.out.println("CONTINUOUS SUM");
        System.out.println("---------------");

        while(value != 0){
            System.out.println("Enter a digit (0 = quit)");
            value = scan.nextInt();
            sum = sum + value;
            nums++;
        }

        if(nums != 0){
            System.out.println("Sum of " + (nums - 1) + " number(s) is: " + sum);
        } else {
            System.out.println("No digits were entered");
        }
    }
}