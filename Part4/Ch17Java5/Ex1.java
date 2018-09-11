import java.util.Scanner;

class Ex1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int hours, zones, departTime, arriveTime;
        double hoursRecovery;

        System.out.println("How many hours of travel");
        hours = scan.nextInt();
        System.out.println("How many time zones to cross");
        zones = scan.nextInt();

        System.out.println("When will you depart (24hr)");
        departTime = scan.nextInt();
        System.out.println("When will you arrive (24hr)");
        arriveTime = scan.nextInt();

        hoursRecovery = ((hours)/2.0 + (zones - 3) + departTime + arriveTime)/10.0;

        System.out.println("Recovery time: " + hoursRecovery);

    }
}