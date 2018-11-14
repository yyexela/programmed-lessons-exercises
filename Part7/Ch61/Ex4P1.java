import java.io.*;

public class Ex4P1{
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int temp;
        String output = "";

        // write out the old data
        for ( int j=0; j < data.length; j++){
            output = output + ", " + data[j];
        }

        System.out.println(output);

        // reverse the data
        for(int j = 0; j < (data.length/2); j++){
            temp = data[j];
            data[j] = data[data.length-1-j];
            data[data.length-1-j] = temp;
        }
        
        // write out the new data
        output = "";
        for ( int j=0; j < data.length; j++){
            output = output + ", " + data[j];
        }

        System.out.println(output);

    }
}