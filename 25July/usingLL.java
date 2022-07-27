package DataStructure;
import java.util.*;
public class usingLL 
{
    static int c=0;
   Node head,top=null;
   static class Node
   {
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
           this.next=null;
           
       }
   }
   void push(int data) 
   {
       
       
           Node newnode  = new Node(data);
           newnode.next = head;
           head = newnode;
        // top=head;
        // c++;
          
       }
      
   
    void printList() 
    {     
        Node cur = head;
           System.out.print("LinkedList: "); 
           
           while (cur != null) 
           { 
                   
                   System.out.print(cur.data + " "); 
                    
                   cur= cur.next; 
           } 
       
           System.out.println(); 
    } 
    void pop() 
    {
        if(head==null) 
        {
            System.out.println("stackunderflow");
        }
        else 
        {
            System.out.println(head.data+" delete element");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        // TODOpop Auto-generated method stub
        usingLL obj = new usingLL ();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.printList();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.printList();
    }
}