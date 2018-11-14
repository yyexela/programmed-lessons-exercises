import java.io.* ;

class Ex2{
  public static void main ( String[] args )  {
            int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
            
            // declare and initialize variables for the two largest
            int max = data[0];
            int min = data[0];
            
            // compute the two largest
            for ( int index = 0; index < data.length; index++){
                if(max < data[index]) max = data[index];
                if(min > data[index]) min = data[index];
            }
            
            // write out the two largest
            System.out.println( "max: " + max + ", min: " + min );

    }
}     