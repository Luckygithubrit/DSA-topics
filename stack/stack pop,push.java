// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class StackArray{
    

    static class Stack{
        int top=-1;
        
        int a=5;
        int arr[]=new int[a];
        public void push(int i){
            if(top==(a-1)){
                System.out.println("stack is overflow");
                return;
            }
            else{
                top++;
                arr[top]=i;
            }
        }
        public void pop(){
            if(top==-1){
                System.out.println("stack is underflow");
                return;
            }
            else{
                top--;
                
            }
        }
        public void display(){
            if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    
}
public static void main(String[] args){
        Stack s=new Stack();
        s.push(7);
        s.push(3);
        s.push(5);
        s.push(6);
        s.push(4);
        s.push(3);
        s.display();
    }
}
