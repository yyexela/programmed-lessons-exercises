public class Ex6{
    public static void main(String[] args) {
        //int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
        int[] smooth = new int[signal.length];
        
        // compute the smoothed value for each
        //  cell of the array smooth
        smooth[0]  =  (signal[0] + signal[1])/2;
        smooth[ signal.length-1 ] = (signal[signal.length-1] + signal[signal.length-2])/2;
        for (int i = 1; i < signal.length-1; i++){
            smooth[i] = (signal[i-1] + signal[i] + signal[i+1])/3;
        }
        
        // write out the input
        String output = "";
        for ( int j=0; j < smooth.length; j++){
            output = output + signal[j] + "  ";
        }
        System.out.println(output);
        
        output = "";
        // write out the result
        for ( int j=0; j < smooth.length; j++){
            output = output + smooth[j] + "  ";
        }
        System.out.println(output);
    }
}