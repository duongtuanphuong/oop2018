package week7.task1;

public class Numeral extends Expression{
    int value;

    @Override
    public String toString() {
        String a = Integer.toString(value);
        return a;
    }

    @Override
    public int evaluate() {
        return value;
    }

    public Numeral(int v){
        value = v;
    }

    public Numeral(){

    }

}