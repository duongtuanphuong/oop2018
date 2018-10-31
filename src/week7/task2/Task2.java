package week7.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    class Animal{
       int a;
    }
    class Cho extends  Animal{
       double b;
    }
    public void getIOException(String f) throws IOException {
        File file = new File(f);
        if(file.canRead()==false) throw new IOException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ClassCastException()throws ClassCastException{
        Animal a =new Animal();
        Cho b= (Cho)a;
        throw new ClassCastException();
    }
    public void FileNotFoundException(String path) throws FileNotFoundException {
        File file = new File(path);
        if(file.canRead()==false) throw new FileNotFoundException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
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
        String s1 =null;
        String s2 ="CCCCC";
        try {
            System.out.println(task2.NullPointerException(s1, s2));
        }
        catch (NullPointerException e){
            System.out.println("Lỗi NullPointerException");
        }
        try{
            task2.FileNotFoundException("File.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Lỗi FileNotFoundException");
        }
        try {
            task2.ClassCastException();
        }
        catch (ClassCastException ex){
            System.out.println("Lỗi ClassCastException");
        }

    }
}
