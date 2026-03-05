package searching;

import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=sc.nextInt();
        
        
        
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int f=0;
        int l=arr.length-1;
        int mid=(f+l)/2;
        System.out.println("enter the element");
        int element=sc.nextInt();
        // int count=0;
        while(f<=l){
            if(element==arr[mid]){
                System.out.println("found");
                break;
            }
            else if(element>=arr[mid]){
                f=mid+1;
            }
            else{
                l=mid-1;
            }
            mid=(f+l)/2;
        }
        if(f>l){
            System.out.println("not found");
        }
        
        
    }
}