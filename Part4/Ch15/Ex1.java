import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start, end;

        System.out.println("Start number");
        start = scan.nextInt();

        System.out.println("End number");
        end = scan.nextInt();

        System.out.println('\n');

        while(start != end){
            System.out.println(start);
            if(start > end){
                start--;
            }
            if(start < end){
                start++;
            }
        }
        System.out.println(end);

        System.out.println("done");
    }
}