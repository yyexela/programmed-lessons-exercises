public class Ex5{
    public static void main(String[] args) {
        Box box1 = new  Box(2.5,5.0,6.0);
        Box box2 = box1.biggerBox(box1);
        Box box3 = box1.smallerBox(box1);
        Box box4 = new Box(2.6, 4.9, 5.9);

        System.out.println("Box1: " + box1.toString());
        System.out.println("Box2: " + box2.toString());
        System.out.println("Box3: " + box3.toString());
        System.out.println("Box4: " + box4.toString());

        if(box1.nests(box2)){
            System.out.println("box2 nests box1");
        } else System.out.println("box2 doesn't nest box1");

        if(box1.nests(box3)){
            System.out.println("box3 nests box1");
        } else System.out.println("box3 doesn't nest box1");

        if(box1.nests(box4)){
            System.out.println("box4 nests box1");
        } else System.out.println("box4 doesn't nest box1");
        System.out.println("");
    }
}