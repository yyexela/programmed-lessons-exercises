import java.util.Scanner;

public class PantryTester{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int spread = 0, selected = 0;
        
        System.out.println("Welcome to Mother Hubbard's Pantry");
        Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );
    
        Pantry hubbard = new Pantry( goose, apple, rhub );
        System.out.println( hubbard );
        
        selected = userSelect(scan);
        
        while(selected != -1){

            while( !(selected >= 1 && selected <= 3) && selected != -1 ){
                System.out.println("Invalid selection");
                selected = userSelect(scan);
            }

            if(selected != -1){
                hubbard.select(selected);
                spread = spreadAmount(scan);
                while(spread < 0){
                    System.out.println("Invalid spread amount");
                    spread = spreadAmount(scan);
                }
                hubbard.spread(spread);
                System.out.println('\n' + "" + hubbard);
                selected = userSelect(scan);
            }

        }
        
        System.out.println("Goodbye!");
        
    }

    public static int userSelect(Scanner scan){
        System.out.println("Enter your selection (1, 2, or 3):");
        int selected = scan.nextInt();
        return selected;
    }

    public static int spreadAmount(Scanner scan){
        System.out.println("Enter spread amount:");
        int spread = scan.nextInt();
        return spread;
    }

}