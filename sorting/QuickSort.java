package sorting;

public class QuickSort {
    public void sort(int arr[],int n)
    {
        quickSort(arr, 0, n-1);
    }
    void quickSort(int arr[],int low,int high)
    {
        if(low<=high)
        {

            int piv=partition(arr,low,high);
            quickSort(arr, low, piv-1);
            quickSort(arr, piv+1, high);
        }

    }
    int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int j=low-1;
        for(int i=low;i<=high-1;i++)
        {
            if(arr[i]<pivot)
            {
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp=arr[j+1];
        arr[j+1]=arr[high];
        arr[high]=temp;
        return j+1;

    }
    
}