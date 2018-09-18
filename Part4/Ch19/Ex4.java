import java.util.Scanner;
class Ex4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Word to be used: ");
        String word = scan.nextLine();
        
        int length = word.length();
        int count = 0;

        while(count < length){
            System.out.println(word.substring(count,count+1));
            count++;
        }
        System.out.println("finished");
    }
}