import java.util.Arrays;

public class Ex10{
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 2};
        int[] arrayB = {4, 2, 3, 2, 1};

        //Output arrays
        String complete = "";
        for(int i = 0; i < arrayA.length; i++){
            complete = complete + arrayA[i] + " ";
        }
        System.out.println(complete);
        
        complete = "";
        for(int i = 0; i < arrayB.length; i++){
            complete = complete + arrayB[i] + " ";
        }
        System.out.println(complete);

        System.out.println("Elements the same? ");
        if(sameElements(arrayA, arrayB)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean sameElements(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}