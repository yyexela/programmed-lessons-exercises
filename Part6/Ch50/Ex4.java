public class Ex4{
    public static void main(String[] args) {
        Box box1 = new  Box( 2.5, 5.0, 6.0 ) ;
        Box box2 = box1.biggerBox(box1);
        Box box3 = box1.smallerBox(box1);

        System.out.println("Box1: " + box1.toString());
        System.out.println("Box2: " + box2.toString());
        System.out.println("Box3: " + box3.toString());
    }
}