package week12;

public abstract class Sort {
    public void BubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]) {
                    int temp =a[j];
                    a[j] =a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public void selectionSort(int a[]) {
        for (int i =0;i<a.length;i++){
            for (int j =0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] =temp;
                }
            }
        }
    }
}
