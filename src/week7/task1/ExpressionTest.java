package week7.task1;

public class ExpressionTest {
    public static void main(String [] args){
       Square a =new Square(new Numeral(10));
       Subtration b =new Subtration(a, new Numeral(1));
       Multiplication c = new Multiplication(new Numeral(2), new Numeral(3));
       Addition d = new Addition(b,c);
       Square f =new Square(d);
       //(10^2-1+2*3)^2==11025
       System.out.println(f.evaluate());
        Division div =new Division(new Numeral(6), new Numeral(0));
        try{
            double x;
            x= div.left.evaluate()/div.right.evaluate();
            System.out.println(x);
        }catch (ArithmeticException e ){
            System.out.println("Không thể chia cho số 0");
        }

    }
}
