import java.io.* ;

public class Ex3{
    public static void main(String[] args) {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        // declare and initialize variables
        int closest = data[0];
        
        // find the element nearest to zero
        for ( int i = 0; i < data.length; i++ ){
            if(closest > Math.abs(data[i])) closest = data[i];
        }
        
        // write out the element nearest to zero
        System.out.println( "closest: " + closest );
    }
}