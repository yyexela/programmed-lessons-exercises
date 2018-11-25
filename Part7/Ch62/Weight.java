public class Weight{
  private int[] data;
  
  // Constructor
  public Weight(int[] init){
        // Make data the same length
        // as the array referenced by init.
        data = new int[init.length];
        
        // Copy values from the 
        // input data to data.
        for (int i = 0; i < data.length; i++){
            data[i] = init[i];
        }
    }
    
    //Print
    public String toString(){
        String complete = "";
        for(int i = 0; i < data.length; i++){
            complete += data[i] + ", ";
        }
        return complete;
    }

    //Average
    public int average(){
        int avg = 0;
        for(int i = 0; i < data.length; i++){
            avg += data[i];
        }
        avg = avg / data.length;
        return avg;
    }
}