package DSA.Searching;

public class Linear {
    static boolean linearSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int key=7;
        if(linearSearch(a,key)){
            System.out.print("Element Found");
        }else{
            System.out.print("Element is Not found");
        }

    }
}
