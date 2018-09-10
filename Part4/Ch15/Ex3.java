import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dots = "";
        int i = 0;

        System.out.println("Enter string 1");
        String str1 = scan.nextLine();

        System.out.println("Enter string 2");
        String str2 = scan.nextLine();

        System.out.println('\n');

        while(i != 30){
            dots = dots + ".";
            i++;
        }

        System.out.println(str1 + dots + str2);

        System.out.println('\n');

        System.out.println("done");
    }
}
