import java.util.*;
class Main {
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotindex=partition(arr,low,high);
            quicksort(arr,low,pivotindex-1);
            quicksort(arr,pivotindex+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];//0
        int start=low;//0
        int end=high;//last index
        while(start<=end){
            while(start<=high && arr[start]<=pivot){
                start++;
            }
            while(end>=low&&arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            
        }
        int temp=arr[low];
        arr[low]=arr[end];
        arr[end]=temp;
        return end;
        
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size");
        int a=sc.nextInt();
        
        int arr[]=new int[a];
        System.out.println("enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}