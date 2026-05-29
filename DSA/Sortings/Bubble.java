package DSA.Sortings;

public class Bubble {
    static void swap(int a[],int x,int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void main(String[] args){
        int a[] = {9,8,7,6,5,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
        for(int i:a) System.out.print(i+" ");
    }
}
