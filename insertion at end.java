import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int a=sc.nextInt();
        
        // int b[]=new int[arr.length+1];

        int arr[]=new int[a];
        int arr2[]=new int[arr.length+1];
        System.out.println("enter the numbers");
        
       
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the new element to add in last:");
        int element=sc.nextInt();
        arr2[arr2.length-1]=element;
        
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        
    }
}