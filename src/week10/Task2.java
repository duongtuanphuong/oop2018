package week10;


import java.util.Random;

public class Task2 {
    private static void BubbleSort(float[] a){
        int i,j;
        for ( i=0;i<1000-1;i++){
            for( j=1000-1;j>i;j--){
                if (a[j]<a[j-1]){
                    float x = a[j];
                    a[j]= a[j-1];
                    a[j-1] = x;
                }
            }
        }
    }

    public static void main(String [] args){
        float a[]  = new float[1000];
        Random rd = new Random();
        for (int i = 0;i<1000;i++){
            a[i]= rd.nextFloat();
        }
        Task2.BubbleSort(a);
        for (int i =0;i<1000;i++){
            System.out.println(a[i]);
        }
    }

}


