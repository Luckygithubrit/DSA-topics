import java.util.*;
public class Linkedlist {
    Node head;
    private int size;
    
    class Node{
        String data;
        Node nextnode;//holds address
        public Node(String data){
            this.data=data;
            this.nextnode=null;
            size++;
            
        }
        public String toString(){
            return data;
        }
        
    }
    //insertion from first
    public void insertfirst(String data){
        Node newnode=new Node(data);//calling constructor
        if(head==null){
            head=newnode;
            return;
        }
        else{
            newnode.nextnode=head;
            head=newnode;
        }
    }
    //insertion last
    public void insertlast(String data){
        Node newnode=new Node(data);//calling constructor
        if(head==null){
            head=newnode;
            return;
        }
        Node currentnode=head;
        while(currentnode.nextnode!=null){
            currentnode=currentnode.nextnode;
        }
        currentnode.nextnode=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("no data is present");
            return;
        }
        Node currentnode=head;
        while(currentnode!=null){
            System.out.println(currentnode);
            currentnode=currentnode.nextnode;
        }
    }
    //deletion first
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.nextnode;
            
    }
    size--;
    }
    //deletion last
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            
        }
        else if(head.nextnode==null){
            head=null;
        }
        else{
            Node currentnode=head;
            while(currentnode.nextnode.nextnode!=null){
                currentnode=currentnode.nextnode;
            }
            currentnode.nextnode=null;
        }
        size--;
    }
    //size of linkedlist
    public int getsize(){
        return size;
    }
    
public static void main(String[] args) {
    
    Linkedlist list=new Linkedlist();
    list.insertfirst("java");
    list.insertfirst("lucky");
    list.insertfirst("bhAAi");
    
    list.printlist();
    System.out.println("size before deletion: "+list.getsize());
    System.out.println("before deletion");
    list.deletefirst();
    list.deletelast();
    list.printlist();
    System.out.println("size after deletion: "+list.getsize());
    
    
    
}
}