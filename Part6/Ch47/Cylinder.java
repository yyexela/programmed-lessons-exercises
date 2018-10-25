public class Cylinder{
  private double radius;  // radius of the base
  private double height;  // height of the cylinder
  
  //Variables
  public Cylinder( double radius, double height ){
    this.radius = radius;
    this.height = height;
  }

  //Methods

  //Setters
  public void setRadius(double radius){
    this.radius = radius;
  }

  public void setHeight(double height){
    this.height = height;
  }

  //Getters
  public double getRadius(){
    return radius;
  }

  public double getHeight(){
    return height;
  }

  //Abilities
  public double area(){
    return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
  }
  
  public double volume(){
    return Math.PI*radius*radius*height;
  }
  
}