import java.util.*;
public class CircularLinkedlist {
    Node head;
    Node tail;
    private int size;
    // private int position;
    class Node{
        int data;
        Node nextnode;//holds address
        public Node(int data){
            this.data=data;
            this.nextnode=null;
            // size++;
            
        }
    }
        // public String toString(){
        //     return data;
        // }
        public void insertfirst(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                newnode.nextnode=head;
            }
            else{
                newnode.nextnode=head;
                head=newnode;
                tail.nextnode=head;
            }
            size++;
        }
        public void insertend(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                newnode.nextnode=head;
            }
            else{
                tail.nextnode=newnode;
                tail=newnode;
                tail.nextnode=head;
            }
            size++;
        }
        public void insertAtposition(int position,int data){
            // Node newnode=new Node(data);
            
            if(position<0||position>size){
                System.out.println("list is inavalid");
                return;
            }
            if(position==0){
                insertfirst(data);
                return;
            }
            if(position==size){
                insertend(data);
                return;
            }
            Node newnode=new Node(data);
            Node temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.nextnode;
            }
            newnode.nextnode=temp.nextnode;
            temp.nextnode=newnode;
            size++;
            
        }
        public void deletionfirst(){
            if(head==null){
                System.out.println("list ios empty");
            }
            //only one node
            if(head==tail){
                head=null;
                tail=null;
                
                
            }
            //more tha 1node
            else{
                head=head.nextnode;
                tail.nextnode=head;
                
            }
            size--;
        }
        public void deletionend(){
            if(head==null){
                System.out.println("list ios empty");
            }
            if(head==tail){
                head=null;
                tail=null;
                
                
            }
            //more tha 1node
            else{
                Node current=head;
                while(current.nextnode.nextnode!=head){
                    current=current.nextnode;
                }
                current.nextnode=head;
                tail=current;
            }
            size--;
        }
        public void deleteAtposition(int position){
            if(head==null){
                System.out.println("list ios empty");
            }
            if(position==0){
                deletionfirst();
                return;
            }
            Node current=head;
            for(int i=0;i<position-1 && current.nextnode!=head;i++){
                current=current.nextnode;
                
            }
            if(current.nextnode==head){
                System.out.println("enter yhe proper position");
                return;
            }
            Node nodetodelete=current.nextnode;
            current.nextnode=nodetodelete.nextnode;
            if(nodetodelete==tail){
                tail=current;
            }
            
            size--;
        }
        //print circlar list
        public void print(){
            if(head==null){
                System.out.println("no data is present");
                return;
            }
            Node current=head;
            do {
                System.out.println(current.data);
                current = current.nextnode;
            } while (current != head);
    
            
        }
        
    
    public static void main(String[] args) {
        CircularLinkedlist list=new CircularLinkedlist();
        list.insertfirst(3);
        list.insertend(4);
        list.insertAtposition(2,4);
        list.insertAtposition(1,7);
        System.out.println("before deletion");
        list.print();
        
        System.out.println("after deletion");
        list.deleteAtposition(1);
        list.print();
        
    }
}