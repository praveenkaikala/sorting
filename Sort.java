import java.util.Arrays;

import sorting.*;

public class Sort {
    public static void main(String[] args) {
        int arr[]={10,5,7,9,3};
        SelectionSort ss=new SelectionSort();
        BubbleSort bb=new BubbleSort();
        InsertionSort is=new InsertionSort();
        QuickSort q=new QuickSort() ;
        q.sort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
