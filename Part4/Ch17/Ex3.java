import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int items;
        int seconds;
        int minutes;

        minutes = 0;

        System.out.println("How many items?");
        items = scan.nextInt();

        System.out.println("Single-item heating time?");
        seconds = scan.nextInt();

        if(items >= 3){
            System.out.println("Don't heat more than 3 items");
        }

        if(seconds >= 100){
            minutes = (seconds - (seconds % 100))/100;
            seconds = seconds - (minutes * 100);
            if(seconds > 60){
                minutes = minutes + 1;
                seconds = seconds - 60;
            }
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);

            if(seconds <10){
                System.out.println("Corrected original input: " + minutes + ":0" + seconds);
            } else {
            System.out.println("Corrected original input: " + minutes + ":" + seconds);
            }
        }

        System.out.println("-------------------------------");

        if(items > 3){
            System.out.println("Invalid item amount (item > 3)");
        } else if (items == 2){
            minutes = minutes + minutes/2;
            seconds = seconds + seconds/2;
            if(seconds > 60){
                minutes = minutes + 1;
                seconds = seconds - 60;
            }
            System.out.println("Heat for " + minutes + " minutes and " + seconds + " seconds");
        } else if (items == 3){
            minutes = minutes + minutes;
            seconds = seconds + seconds;
            if(seconds > 60){
                minutes = minutes + 1;
                seconds = seconds - 60;
            }
            System.out.println("Heat for " + minutes + " minutes and " + seconds + " seconds");
        } else if (items == 1){
            System.out.println("Heat for " + minutes + " minutes and " + seconds + " seconds");
        }


    }

}