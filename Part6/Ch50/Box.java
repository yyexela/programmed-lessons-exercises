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
    public double volume(){
        return width*length*height;
    }

    public double area(){
        return 2*width*length + 2*width*height + 2*length*height;
    }

}