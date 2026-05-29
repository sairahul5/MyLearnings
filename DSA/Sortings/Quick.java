package DSA.Sortings;

public class Quick {
    static int partition(int a[],int low,int high){
        int idx=low-1,pivot=a[high];
        for(int i=low;i<high;i++){
            if(a[i]<=pivot){
                idx++;
                swap(a,idx,i);
            }
        }
        idx++;
        swap(a,idx,high);
        return idx;
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivotIdx = partition(a,low,high);
            quickSort(a,low,pivotIdx-1);
            quickSort(a,pivotIdx+1,high);
        }
    }
    public static void main(String[] args){
        int a[] = {9,8,7,6,5,4,3,2,1};
        quickSort(a,0,a.length-1);
        for(int i:a) System.out.print(i+" ");
    }
}
