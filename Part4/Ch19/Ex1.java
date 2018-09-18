import java.util.Scanner;
class Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("start value: ");
        int start = scan.nextInt();
        
        System.out.println("end value: ");
        int end = scan.nextInt();
        
        while(start <= end){
            System.out.println(start);
            start++;
        }
        System.out.println("finished");
    }
}