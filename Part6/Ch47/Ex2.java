public class Ex2{
    public static void main(String[] args) {
        System.out.println("Start program");
        
        Cylinder cyl1 = new Cylinder(2.0, 5.0);

        System.out.println("Height: " + cyl1.getHeight());
        System.out.println("Radius: " + cyl1.getRadius());
        System.out.println("Area: " + cyl1.area());
        System.out.println("Volume: " + cyl1.volume());

        cyl1.setHeight(4.0);
        cyl1.setHeight(10.0);

        System.out.println("Height: " + cyl1.getHeight());
        System.out.println("Radius: " + cyl1.getRadius());
        System.out.println("Area: " + cyl1.area());
        System.out.println("Volume: " + cyl1.volume());


    }
}