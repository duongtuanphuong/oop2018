package week2.task1;

import java.util.Scanner;

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);


        // TODO: Tính ước chung lớn nhất của 2 số a, b
        }

    public static int fibonacci(int n) {
            if (n==0 ) return 0;
            else if (n==1) return 1;
            else  {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        // TODO: Tìm số fibonacci ở vị trí n
            }
    public static void main(String[] args){
        System.out.println("nhap so a :");
        int a =scanner.nextInt();
        System.out.println("nhap so b :");
        int b =scanner.nextInt();
        System.out.println("uoc chung lon nhat cua a va b la :"+ gcd(a,b));
        int n=scanner.nextInt();
        System.out.println("day fibonaci la :" );
        for (int i=0; i<n; i++){
            System.out.println( +fibonacci(i)+" ");
        }



    }
}