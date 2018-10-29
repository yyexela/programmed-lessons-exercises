public class Pantry{
    //Variables
    private Jam jar1, jar2, jar3, selected;
    //Constructor
    public Pantry(Jam jar1, Jam jar2, Jam jar3){
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        this.selected = null;
    }

    public Pantry(Jam jar1, Jam jar2){
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        this.selected = null;
    }

    public Pantry(Jam jar1){
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        this.selected = null;
    }

    //Getter
    public String getSelected(){
        return selected.toString();
    }

    //Functions

    public void mixedFruit(){
        if( (jar1 == null || jar1.getOunces() <= 2) &&
            (jar2 == null || jar2.getOunces() <= 2) &&
            (jar3 == null || jar3.getOunces() <= 2) ){
                int totalOunces = 0;
                if(jar1 != null) totalOunces += jar1.getOunces();
                if(jar2 != null) totalOunces += jar2.getOunces();
                if(jar3 != null) totalOunces += jar3.getOunces();
                jar3 = null;
                jar2 = null;
                jar1.setOunces( totalOunces );
                jar1.setName("Mixed Fruit");
            } else System.out.println("No mixed fruit!");
    
    }

    public void replace(Jam jam, int slot){
        if (select(slot)){
            selected.setName(jam.getName());
            selected.setOunces(jam.getOunces());
            selected.setExpiration(jam.getExpiration());
        }
    }

    public String toString(){
        String complete = "";
        if(jar1 != null){
            complete += "Jar1: " + jar1.toString() + '\n';
        }
        if(jar2 != null){
            complete += "Jar2: " + jar2.toString() + '\n';
        }
        if(jar3 != null){
            complete += "Jar3: " + jar3.toString() + '\n';
        }
        return complete;
    }

    public boolean select(int jar){
        selected = null;
        if(jar == 1 && jar1 != null) selected = jar1;
        if(jar == 2 && jar2 != null) selected = jar2;
        if(jar == 3 && jar3 != null) selected = jar3;
        if(selected != null) return true;
        else return false;
    }

    public void spread(int amount){
        if(selected != null){
            selected.spread(amount);
        }
    }

}