package week4.task2;

public class Main {
    public static void main(String[] args){
        Square sq1 =new Square(3,"Blue",true);
        System.out.println(sq1.getSide());
        System.out.println(sq1.getColor());
        System.out.println(sq1.isFilled()+"\n");

        Square sq2 =new Square();
        sq2.setLength(4);
        sq2.setWidth(6);
        System.out.println(sq2.getArea());
        System.out.println((sq2.getPerimeter()));

        Rectangle r= new Rectangle();
        r.setWidth(4);
        r.setLength(3);
        System.out.println(r.getPerimeter()+"\n");


        Circle c=new Circle();
        c.setRadius(9);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());


    }
}
