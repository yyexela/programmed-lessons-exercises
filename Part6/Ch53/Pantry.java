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

    //Getter
    public String getSelected(){
        return selected.toString();
    }

    //Functions
    public String toString(){
        String complete = "";
        complete += "Jar1: " + jar1.toString() + '\n';
        complete += "Jar2: " + jar2.toString() + '\n';
        complete += "Jar3: " + jar3.toString() + '\n';
        return complete;
    }

    public void select(int jar){
        if(jar == 1) selected = jar1;
        if(jar == 2) selected = jar2;
        if(jar == 3) selected = jar3;
    }

    public void spread(int amount){
        selected.spread(amount);
    }

}