// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package trees;
import java.util.*;
class BinaryTree{
    static Scanner sc=new Scanner(System.in);
    

    public static void main(String[] args) {
        System.out.println("create a binart tree");
        Node root=createtree();
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
        
    }
    public static Node createtree(){
        Node root=null;
        System.out.println("enter the data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter the left child");
        root.left=createtree();
        System.out.println("enter the right child");
        root.right=createtree();
        return root;
        
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        
        postorder(root.right);
        System.out.println(root.data+" ");
    }
}
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
    
}