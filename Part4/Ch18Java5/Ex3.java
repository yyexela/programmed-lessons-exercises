import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println('\n' + "In-range/Out-of-range Adder" + '\n');

        boolean loop = true;
        int lower;
        int upper;
        int num;
        int sumRange = 0;
        int sumOuter = 0;
        int rangeNums = 0;
        int outerNums = 0;

        System.out.println("Input lower bound: ");
        lower = scan.nextInt();

        System.out.println("Input upper bound");
        upper = scan.nextInt();

        System.out.println('\n' + "Enter '0' to exit the program" + '\n');

        while(loop){
            System.out.println("Enter number: ");
            num = scan.nextInt();
            if(num == 0){
                System.out.println("Exiting loop" + '\n');
                loop = false;
            } else {
                if(num >= lower && num <= upper){
                    sumRange = sumRange + num;
                    rangeNums++;
                } else {
                    sumOuter = sumOuter + num;
                    outerNums++;
                }
            }
        }

        if(rangeNums != 0){
            System.out.println("Range sum: " + sumRange);
        } else {
            System.out.println("No numbers in-range added");
        }
        
        if(outerNums != 0){
            System.out.println("Outside range sum: " + sumOuter);
        } else {
            System.out.println("No numbers outer-range added");
        }
    }
}