import java.util.Arrays;

public class Ex9{
    public static void main(String[] args) {
        int[] arrayA = { 1, 2, 3, 4 };
        int[] arrayB = { 1, 2, 3, 4 };

        System.out.println(compareArrayMyEquals(arrayA, arrayB));
        System.out.println(compareArrayMyEquals(arrayA, null));
        System.out.println(compareArrayMyEquals( null, arrayB));
        System.out.println(compareArrayMyEquals( null, null));
    }

    public static String compareArrayMyEquals(int[] a, int[] b){
        String complete = "Arrays says ";
        if ( Arrays.equals( a, b ) )
            complete = complete + " Equal";
        else
            complete = complete + " NOT Equal";
        complete = complete + '\n';

        complete = complete + "myEquals says ";
        if ( myEquals( a, b ) )
            complete = complete + " Equal";
        else
            complete = complete + " NOT Equal";
        complete = complete + '\n';

        return complete;

    }

    public static boolean myEquals(int[] a, int[] b){
        if(a != null && b != null && a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]) return false;
            }
            return true;
        }
        if(a == null && b == null) return true;
        return false;
    }

}