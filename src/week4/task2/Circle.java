package week4.task2;

public class Circle extends Shape {
    private double radius =1.0;
    private double Pi=3.14;
    public Circle(){

    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return  radius;
    }
    /*
    *tính diện tích
    *
     */
    public double getArea(){
        return Pi*radius*radius;
    }
    /*
    *
    * tính chu vi
    *
     */
    public double getPerimeter(){
        return Pi*2*radius;
    }
    public String toString(){
        return "Circle";
    }
}
