import java.util.Arrays;

public class Ex11{
    public static void main(String[] args) {
        double max = Math.pow(Integer.MAX_VALUE, 1.0/3);
        System.out.println("Cube root of int max: " + max);
        int num = 4;
        int[] array1 = makeArray(num * num);
        int[] array2 = makeArray(num * num * num);

        /*
        //Output arrays
        String complete = "square array: ";
        int[] array1 = makeArray(num * num);
        for(int i = 0; i < array1.length; i++){
            complete = complete + array1[i] + " ";
        }
        System.out.println(complete);

        complete = "cube array: ";
        int[] array2 = makeArray(num * num * num);
        for(int i = 0; i < array1.length; i++){
            complete = complete + array2[i] + " ";
        }
        System.out.println(complete);
        */
        
        //Output nums that match criteria
        for(int i = 0; i < max; i++){
            array1 = makeArray(i * i);
            array2 = makeArray(i * i * i);
            if(noRepeats(array1, array2)){
                if(array1.length + array2.length == 10) System.out.println(i + " (each of 10)");
                else System.out.println(i);
            }
        }
    }

    public static boolean noRepeats(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length-1; i++){
            if(a[i] == a[i+1]) return false;
        }

        for(int i = 0; i < b.length-1; i++){
            if(b[i] == b[i+1]) return false;
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]) return false;
            }
        }
        return true;
    }

    public static int[] makeArray(int a){
        int n = a;

        int numLength = 0;
        while(n > 0){
            numLength ++;
            n = n / 10;
        }

        n = a;
        int[] array = new int[numLength];
        for(int i = 0; i < array.length; i++){
            array[i] = n % 10;
            n = n / 10;
        }

        return array;
    }
}