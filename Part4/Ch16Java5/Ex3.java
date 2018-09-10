import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers are in the set?");
        int N = scan.nextInt();

        double sum = 0;
        double squareSum = 0;
        double avg, SD, inputNum, avgSquare;
        int i = 0;

        //While loop then finding average

        while(i != N){
            System.out.println("input number: ");
            inputNum = scan.nextDouble();
            sum = sum + inputNum;
            squareSum = squareSum + (inputNum * inputNum);
            i++;
        }

        avg = sum / N;
        avgSquare = squareSum / N;
        System.out.println("average: " + avg);
        System.out.println("averageSquare: " + avgSquare);

        SD = Math.sqrt(avgSquare - (avg * avg));
        System.out.println(SD);
        System.out.println("Done");
    }
}