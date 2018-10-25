public class Ex3{
    public static void main(String[] args) {
        Box box1 = new  Box( 2.5, 5.0, 6.0 ) ;
        Box box2 = new Box(box1);

        System.out.println("Box1: " + box1.toString());
        System.out.println("Box2: " + box2.toString());
        //System.out.println( "topArea: "  + box.topArea() );
    }
}