// Online Java Compiler
// Use this editor to write, compile and run your Java code online

package sorting;
import java.util.*;
class Main {
    public static void mergesort(int arr[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergesort(arr,start,mid);//left half
            mergesort(arr,mid+1,end);//right half
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int arr[],int start,int mid,int end){
        int size=mid-start+1;//left subarray size
        int size1=end-mid;//right subarray size;
        int leftarr[]=new int[size];
        int rightarr[]=new int[size1];
        //copy left array
        for(int i=0;i<size;i++){
            leftarr[i]=arr[start+i];
        }
        //copy right array
        for(int j=0;j<size1;j++){
            rightarr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=start;
        //merge
        while(i<size&&j<size1){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
            }
            else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        //remaining left
        while(i<size){
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        //remaining right
        while(j<size1){
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int a=sc.nextInt();
        
        
        
        int arr[]=new int[a];
        System.out.println("enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,arr.length-1);
        System.out.println("sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
        
        
    }
}