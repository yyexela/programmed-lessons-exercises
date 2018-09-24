import java.util.Scanner;

class Ex2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are at the party?");
        int N = scan.nextInt();
        
        double prob = (365-1.0)/365;
        double prob1 = 1.0 - prob;

        int min = -1;

        //System.out.println("N = 2 Prob1 = " + prob1);

        if(N < 0){
            System.out.println("N can't be less than 0");
        } else if (N == 1 || N == 0){
            System.out.println("Enter more than 1 person");
        } else if (N == 2){
            System.out.println("N of 2 has a probability of " + prob1);
        }

        for(int i = 2; prob1 <= 0.5; i++){
            prob = prob * ((365.0-i)/365);
            prob1 = 1.0 - prob;
            //System.out.println("N = " + (i+1) + " Prob1 = " + prob1);
            if((i+1) == N){
                System.out.println("N of " + (i+1) + " has a probability of " + prob1);
            }
            min = i+1;
        }
        System.out.println("--------------");
        System.out.println("Minimum N of " + (min) + " needed for a probability of " + prob1);
        System.out.println("DONE");

    }
}