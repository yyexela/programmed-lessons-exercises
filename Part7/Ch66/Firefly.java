public class Firefly{
    //Instance Variables
    int X, Y, Z;
    boolean alive;

    //Constructor
    public Firefly(){
        X = (int) (Math.random() * 20) - 10;
        Y = (int) (Math.random() * 20) - 10;
        Z = (int) (Math.random() * 20) - 10;
        alive = true;
    }

    //Methods
    public void move(){
        //Move X within bounds of -10 to 10
        int change = ((int) (Math.random() * 3) - 1);
        while(10 < X + change || -10 > X + change){
            change = ((int) (Math.random() * 3) - 1);
        }
        X += change;

        //Move Y within bounds of -10 to 10
        change = ((int) (Math.random() * 3) - 1);
        while(10 < Y + change || -10 > Y + change){
            change = ((int) (Math.random() * 3) - 1);
        }
        Y += change;

        //Move Z within bounds of -10 to 10
        change = ((int) (Math.random() * 3) - 1);
        while(10 < Z + change || -10 > Z + change){
            change = ((int) (Math.random() * 3) - 1);
        }
        Z += change;
    }

    public void died(){
        alive = false;
    }

    public boolean getAlive(){
        return alive;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public int getZ(){
        return Z;
    }

    public String toString(){
        String isAlive;

        if(alive) isAlive = "true";
        else isAlive = "false";

        return (X + "  "  + Y + "  "  + Z + "  "  + isAlive);
    }
}