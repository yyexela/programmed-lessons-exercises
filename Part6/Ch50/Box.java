public class Box{
    //Variables
    private double width;
    private double height;
    private double length;

    //Constructor
    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox){
        this.width = oldBox.getWidth();
        this.height = oldBox.getHeight();
        this.length = oldBox.getLength();
    }

    //Methods
    //Getters
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

    public String toString(){
        return "Width: " + this.getWidth() + ", Height: " + this.getHeight() + ", Length: " + this.getLength();
    }

    //Setters
    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setSide(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }

    //Functions
    private double topArea(){
        return width*length;
    }

    private double faceArea(){
        return height*length;
    }

    private double sideArea(){
        return width*height;
    }

    public double volume(){
        return width*length*height;
    }

    public double area(){
        return 2*topArea() + 2*sideArea() + 2*faceArea();
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25*oldBox.getWidth(), 1.25*oldBox.getHeight(), 1.25*oldBox.getLength());
    }

    public Box smallerBox(Box oldBox){
        return new Box(0.75*oldBox.getWidth(), 0.75*oldBox.getHeight(), 0.75*oldBox.getLength());
    }

}