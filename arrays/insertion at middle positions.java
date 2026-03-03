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
        System.out.println("enter the new element to add :");
        int element=sc.nextInt();
        System.out.println("at which index element should be added:");
        int index=sc.nextInt();
        
        arr2[arr.length-1]=element;
        
        for(int i=0;i<arr2.length;i++){
            if(i==index){
                arr[i]=element;
            }
            else if(i<index){
                arr2[i]=arr[i];
            }
            else{
                arr2[i]=arr[i-1];
            }
            
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        
    }
}