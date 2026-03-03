import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        System.out.println("enter the numbers:");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            
        }
        // System.out.println("enter the element to delete: ");
        // int element=sc.nextInt();
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
          
            
        }
        size--;
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
          
            
        }
        
        
        
        
    }
}