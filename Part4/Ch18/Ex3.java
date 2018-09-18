import java.util.Scanner;

class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int frontRight;
        int frontLeft;
        int backRight;
        int backLeft;

        boolean error = false;

        System.out.println("Input front-right tire pressure: ");
        frontRight = scan.nextInt();

        error = range(frontRight);

        System.out.println("Input front-left tire pressure: ");
        frontLeft = scan.nextInt();

        error = range(frontLeft);

        System.out.println("Input back-left tire pressure: ");
        backLeft = scan.nextInt();

        error = range(backLeft);

        System.out.println("Input back-right tire pressure: ");
        backRight = scan.nextInt();

        error = range(backRight);

        if(frontRight != frontLeft){
            error = true;
        }
        if(backRight != backLeft){
            error = true;
        }

        System.out.println("---------------------");
        System.out.println("Tire Inflations:");
        System.out.println("Front-right:" + frontRight);
        System.out.println("Front-left:" + frontLeft);
        System.out.println("Back-right:" + backRight);
        System.out.println("Back-left:" + backLeft);
        System.out.println("---------------------");

        if(error){
            System.out.println("INFLATION IS NOT OK, REPEAT, NOT OK");
        } else {
            System.out.println("Inflation is good brah");
        }

    }
    public static boolean range(int tirePressure){
        if(tirePressure >= 35 && tirePressure <= 45){
            return false;
        } else {
            System.out.println("Error: Tire inflation out of range");
            return true;
        }
    }
}