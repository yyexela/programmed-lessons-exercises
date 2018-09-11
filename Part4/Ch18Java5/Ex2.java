import java.util.Scanner;

class Ex2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int initialMiles = 0;
        int finalMiles = 0;
        int gallons = 0;
        int cars = 0;
        boolean loop = true;
        double mpg;

        System.out.println("MPG program");
        System.out.println(" ");
        while(loop){

            System.out.println("Initial miles");
            initialMiles = scan.nextInt();

            if(initialMiles >= 0){
                System.out.println("Final miles");
                finalMiles = scan.nextInt();
    
                if(finalMiles < initialMiles){
                    System.out.println("Error, cannot have final miles be less than initial");
                    loop = false;
                    break;
                }

                System.out.println("Gallons of gas");
                gallons = scan.nextInt();
    
                mpg = ((finalMiles + 0.0) - initialMiles)/gallons;
    
                System.out.println("MPG: " + mpg);
                cars++;
                System.out.println(" ");
            } else {
                System.out.println(" ");
                loop = false;
            }
        }

        if(cars == 0){
            System.out.println("No cars entered, GOODBYE");
        } else {
            System.out.println("Ending program");
        }
    }
}