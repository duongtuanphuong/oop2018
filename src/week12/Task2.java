package week12;

public class Task2  extends  Sort{
    public static void main(String [] args){
        int a[] ={1,34,543,2,3242,343,523,523242,2};
        Task2 test =new Task2();
        test.BubbleSort(a);
        for (int st : a)
        {
            System.out.print(st+" ");
        }
        test.selectionSort(a);
        for (int st : a)
        {
            System.out.print(st+" ");

        }

    }
}
