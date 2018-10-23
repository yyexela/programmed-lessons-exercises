import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Radius:");
        Double radius = scan.nextDouble();

        System.out.println("Height:");
        Double height = scan.nextDouble();

        Cone cone1 = new Cone(radius, height);

        System.out.println("Cone area: " + cone1.area());
        System.out.println("Cone slantHeight: " + cone1.slantHeight());
        System.out.println("Cone angle: " + cone1.angle());


    }
}