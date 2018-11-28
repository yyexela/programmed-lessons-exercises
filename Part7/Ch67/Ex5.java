import java.io.* ;

public class Ex5{

    public static void main ( String[] args ){
        int[][] data = { {2222, 2, 2},
                        {2, 4, 2, 2, 2},
                        {-155, 2, 5, 1, 2,},
                        {0, 2, 6, 3, -1, -8222} };
        
        // declare and initialize the max and the min
        int max, min;
        
        //  
        for ( int row=0; row < data.length; row++){
            max = data[row][0]; min = data[row][0];
            for ( int col=0; col < data[row].length; col++){
                if(data[row][col] > max) max = data[row][col];
                if(data[row][col] < min) min = data[row][col];
            }
            System.out.println("row " + row + " max = " + max + ", min = " + min );
        }
    }
}      