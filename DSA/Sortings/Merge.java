package DSA.Sortings;


public class Merge{
    static void merge(int a[],int temp[],int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid) temp[k++]=a[i++];

        while(j<=high) temp[k++]=a[j++];

        for(int o=low;o<=high;o++) a[o]=temp[o];
    }
    static void mergeSort(int a[],int temp[],int low,int high){
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(a,temp,low,mid);
            mergeSort(a,temp,mid+1,high);

            merge(a,temp,low,mid,high);
        }
    }
    public static void main(String[] args){
        int a[] = {9,8,7,6,5,4,3,2,1};
        int temp[] = new int[a.length];
        mergeSort(a,temp,0,a.length-1);
        for(int i:a) System.out.print(i+" ");
    }
}