public class FireflyTester{
    public static void main(String[] args) {
        System.out.println("Program Start");

        //Variables
        int amount = 10;
        int amountAlive = amount;
        int last = -1;

        //Declaring the array of fireflies
        Firefly[] fireflies = new Firefly[amount];
        
        //Initializing the fireflies
        System.out.println("Making Fireflies");
        for(int i = 0; i < fireflies.length; i++){
            fireflies[i] = new Firefly();
            System.out.println("Firefly " + i + " : " + fireflies[i].toString() );
        }

        //Moving fireflies until 1 is left
        System.out.println("Moving Fireflies");
        while(amountAlive > 1){
            for(int i = 0; i < fireflies.length; i++){
                if(fireflies[i].getAlive()){
                    fireflies[i].move();
                    for(int j = 0; j < fireflies.length; j++){
                        if(i != j && fireflies[j].getAlive() == true){
                            double distanceFrom = Math.pow( 
                                (
                                    (Math.pow(fireflies[i].getX() - fireflies[j].getX(), 2)) + 
                                    (Math.pow(fireflies[i].getY() - fireflies[j].getY(), 2)) + 
                                    (Math.pow(fireflies[i].getZ() - fireflies[j].getZ(), 2))  
                                ) , 1.0/2 );
                            //System.out.println("Distance from " + i + " to " + j + " is " + distanceFrom);
                            if(distanceFrom <= 1){
                                fireflies[j].died();
                                System.out.println(j + " died by " + i);
                                amountAlive--;
                                last = i;
                            }
                            if(amountAlive == 1) break;
                        }
                    }
                    //System.out.println(i + " : " + fireflies[i].toString());
                }
            }
        }
        
        System.out.println("Last alive: " + last + " at " + fireflies[last].toString() );
        System.out.println("Program End");

    }
}