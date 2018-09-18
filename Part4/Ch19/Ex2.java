import java.util.Scanner;
class Ex2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Word to be used: ");
        String word = scan.nextLine();
        
        int length = word.length();
        int count = 1;

        while(count < length){
            System.out.println(word);
            count++;
        }
        System.out.println("finished");
    }
}