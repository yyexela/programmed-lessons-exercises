public class Jam{
    //Variables
    private String name, expiration;
    private int ounces;

    //Constructor
    public Jam(String name, String expiration, int ounces) {
        this.name = name;
        this.expiration = expiration;
        this.ounces = ounces;
    }

    //Getters
    public String getName(){
        return this.name;
    }
    
    public String getExpiration(){
        return this.expiration;
    }

    public int getOunces(){
        return this.ounces;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setExpiration(String expiration){
        this.expiration = expiration;
    }

    public void setOunces(int ounces){
        this.ounces = ounces;
    }

    //Functions

    public void spread(int amount){
        if(amount >= ounces){
            ounces = 0;
        } else ounces -= amount;
    }

    public boolean empty(){
        if(ounces <= 0){
            return true;
        } else return false;
    }

    public String toString(){
        return this.name + " " + this.expiration + " " + this.ounces + "fl. oz.";
    }

}