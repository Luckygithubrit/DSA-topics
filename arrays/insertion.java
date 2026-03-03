import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int a=sc.nextInt();
        
        int arr[]=new int[a];
        System.out.println("enter the numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("the array is :"+arr[i]);
        }
    }
}