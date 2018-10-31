package week7.task2;

public class Task2 {
    class Meo{
        public void Voice(){

        }
    }


    public double ArithmeticException(double x,double y) {
        if(y==0) throw  new ArithmeticException();
        return x/y;
    }
    public boolean NullPointerException(String a, String b) throws NullPointerException{
        if(a==null) throw new NullPointerException();
        return a.equals(b);
    }



    public static void main(String[] args) {
        Task2 task2 =new Task2();
        try{
            System.out.println(task2.ArithmeticException(2,0));
        }catch (ArithmeticException e){
            System.out.println("Lỗi ArithmeticException ");
        }

    }
}
