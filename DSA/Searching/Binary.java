package DSA.Searching;

public class Binary {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int key=7;
        int low=0;
        int high=a.length-1;
        boolean x=false;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid]==key){
                x=true;
                break;
            }else if(a[mid]>key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(x){
            System.out.println("Element Found");
        }else{
            System.out.println("Element is Not Found");
        }
    }
}
