package sorting;

public class SelectionSort {
    public void sort(int arr[],int n)
    {
        for(int  i=0;i<n;i++)
        {
            int min=i;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<arr[min]) min=j;
            }
            if(min>i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}