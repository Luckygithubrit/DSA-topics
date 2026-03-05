package searching;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=sc.nextInt();
        
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element");
        int element=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("element is found "+i);
                count++;
                break;
            }
            
        }
        if(count==0){
            System.out.println("not found");
        }
        
        
    }
}