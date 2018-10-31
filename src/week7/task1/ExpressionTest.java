package week7.task1;

public class ExpressionTest {
    public static void main(String [] args){
       Square a =new Square(new Numeral(10));
       Subtration b =new Subtration(a, new Numeral(1));
       Multiplication c = new Multiplication(new Numeral(2), new Numeral(3));
       Addition d = new Addition(b,c);
       Square f =new Square(d);
       System.out.println(f.evaluate());
    }
}
