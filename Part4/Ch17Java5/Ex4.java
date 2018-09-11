import java.util.Scanner;

class Ex4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What thing?");
        String thing = scan.nextLine();

        System.out.println("How many of thing?");
        int thingNum = scan.nextInt();

        String output = "";

        int i = 0;
        while(i != thingNum){
            output = output + thing;
            i++;
        }

        i = 0;

        while(thingNum != i){
            System.out.println(output);
            output = output.substring(0, output.length()-thing.length());
            i++;
        }
    }
}