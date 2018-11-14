import java.util.Scanner;
public class Ex5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] letterOccurance = new int[alphabet.length];

        for(int i = 0; i < sentence.length(); i++){
            for(int j = 0; j < alphabet.length; j++){
                if( sentence.charAt(i) == alphabet[j] )  letterOccurance[j] += 1;
            }
        }

        Boolean isPanagram = true;
        String complete = "";
        for(int i = 0; i < alphabet.length; i++){
            if(letterOccurance[i] == 0) isPanagram = false;
            complete = complete + alphabet[i] + letterOccurance[i] + "  ";
        }

        System.out.println(complete);
        if(isPanagram){
            System.out.println("is panagram");
        } else {
            System.out.println("is not panagram");
        }

    }
}