import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23{

static void levelOrder(Node root){
     Queue<Node> q = new LinkedList();
     if(root != null){
         q.add(root);
     }
     while(!q.isEmpty())
     {
         Node current = q.remove();
         System.out.print(current.data + " ");
         
         if(current.left != null) q.add(current.left);
         if(current.right!=null) q.add(current.right);
     }
    
      
    }

public static Node insert(Node root,int data){