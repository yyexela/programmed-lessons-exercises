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