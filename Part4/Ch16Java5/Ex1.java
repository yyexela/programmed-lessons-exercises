import java.util.Scanner;

class Ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers added?");
        int numbers = scan.nextInt();

        int i = 0;
        int sum = 0;

        while(i != numbers){
            System.out.println("Enter a number: ");
            sum = sum + scan.nextInt();
            i++;
        }

        if(numbers == 0){
            System.out.println("No numbers, no sum");
        } else {
            System.out.println("Sum: " + sum);
        }
    }
}