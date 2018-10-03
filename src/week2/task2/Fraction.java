package week2.task2;

public class Fraction {
    private int numerator,denominator;
    // TODO: khai báo các thu?c tính

    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
        // TODO: kh?i t?o giá tr? cho các thu?c tính numberator (t? s?), denominator (m?u s?)
    }

    public Fraction add(Fraction other) {
        Fraction sum = new Fraction(1,1);
        sum.numerator = this.numerator*other.denominator+other.numerator*this.denominator;
        sum.denominator=this.denominator*other.denominator;
        System.out.println(sum.numerator + "/" + sum.denominator);
        return sum;
        // TODO: Phuong th?c c?ng hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i

    }

    public Fraction subtract(Fraction other) {
        Fraction subtract = new Fraction (1,1);
        subtract.numerator=this.numerator*other.denominator-other.numerator*this.denominator;
        subtract.denominator=this.denominator*other.denominator;
        System.out.println(subtract.numerator + "/" + subtract.denominator);
        return subtract;

        // TODO: Phuong th?c tr? hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
    }

    public Fraction multiply(Fraction other) {
        Fraction multiply = new Fraction(1,1);
        multiply.numerator=this.numerator*other.numerator;
        multiply.denominator=this.denominator*other.denominator;
        System.out.println(multiply.numerator + "/" + multiply.denominator);
        return multiply;
        // TODO: Phuong th?c nhân hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i

    }

    public Fraction divide(Fraction other) {
        Fraction divide=new Fraction(1,1);
        divide.numerator=this.numerator*other.denominator;
        divide.denominator=this.denominator*other.numerator;
        System.out.println(divide.numerator + "/" + divide.denominator);

        return divide;
        // TODO: Phuong th?c chia hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i

    }

    public boolean equals(Object obj){
        Fraction a = (Fraction) obj;
        return (numerator*a.denominator == a.numerator*denominator);

    }

    public static void main(String[] args){
        Fraction a = new Fraction(12,34);
        Fraction b = new Fraction(2,9);
        Fraction c = new Fraction(1,1);

    }
}
