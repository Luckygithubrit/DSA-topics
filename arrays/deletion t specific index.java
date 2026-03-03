import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        System.out.println("enter the numbers:");
        int a[]=new int[size];
        int b[]=new int[a.length-1];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            
        }
        System.out.println("enter the index");
        int index=sc.nextInt();
        
        if(index<0||index>=a.length){
            System.out.println("enter the correct index");
            return;  
        }
        for(int i=0;i<index;i++){
            b[i]=a[i];
        }
    
        for(int i=index;i<b.length;i++){
            b[i]=a[i+1];
          
            
        }
        // size--;
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
          
            
        }
        
        
        
        
    }
}