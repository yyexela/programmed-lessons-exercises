public class Ex1{
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0) ;

        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
   
        System.out.println( "length: " + box.getLength() + " height: " + box.getHeight() +" width: " + box.getWidth() )  ;
    }
}