public class Ex3{
    public static void main ( String[] args ){
        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        
        // declare the sum
        int sum;
        int maxColumn = 0;

        //find maxColumn
        for(int row = 0; row < data.length; row++){
            if(data[row].length > maxColumn) maxColumn = data[row].length;
        }
        
        // compute the sums for each column
        for ( int col=0; col < maxColumn; col++){
          sum = 0;

            for(int row = 0; row < data.length; row++){
                if( data[row].length > col ){
                    sum += data[row][col];
                }
            }
          
          // write the sum for this row
          System.out.println("Sum of column " + col + " is: " + sum);
        }
    }
}