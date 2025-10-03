package sorting;

public class MergeSort {
    public void merge(int arr[],int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=arr[left+i];
        }
         for(int i=0;i<n2;i++)
        {
            arr2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=left;
        while (i<n1 && j<n2) {
            if(arr1[i]<arr2[j])
            {
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }
         while (i < n1) arr[k++] = arr1[i++];
         while (j < n2) arr[k++] = arr2[j++];
    }
    public void sort(int arr[],int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }

    }
}
