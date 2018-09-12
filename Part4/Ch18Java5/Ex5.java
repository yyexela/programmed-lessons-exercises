import java.util.Scanner;

class Ex5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        int x1, x2, y1, y2, height, width, area, perimeter;

        System.out.println("Rectangle calculator program");
        System.out.println("Input 2 X and Y coordinates of a rectangle to find height, width, area, and perimeter" + '\n');

        while(loop){
            System.out.println("First corner X");
            x1 = scan.nextInt();
            System.out.println("First corner Y");
            y1 = scan.nextInt();
            System.out.println("Second corner X");
            x2 = scan.nextInt();
            System.out.println("Second corner Y");
            y2 = scan.nextInt();

            height = Math.abs(y1-y2);
            width = Math.abs(x1-x2);

            if(height == 0 || width == 0){
                System.out.println("Width or height is 0, exiting program");
                loop = false;
            } else {
                perimeter = (height * 2) + (width * 2);
                area = height * width;

                System.out.println("Height = " + height + ", Width = " + width + ", Area = " + area + ", Perimeter = " + perimeter + '\n');

            }

        }

    }
}