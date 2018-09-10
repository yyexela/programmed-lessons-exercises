import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string");
        String str1 = scan.nextLine();

        int str1Length = str1.length();
        int i = 0;

        System.out.println('\n');

        while(i != str1Length){
            System.out.println(str1);
            i++;
        }
        System.out.println("done");
    }
}
