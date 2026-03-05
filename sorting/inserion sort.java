package sorting;

import java.util.*;
class Main {
    public static void insertionsort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int a=sc.nextInt();
        System.out.println("enter the values");
        int arr[]=new int[a];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr);
        System.out.println("sorted array is:");
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
        
        
        
    }
}