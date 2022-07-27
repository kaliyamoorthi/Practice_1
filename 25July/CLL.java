package DataStructure;

public class CLL 
{ 
    	static class Node 
    	{ 
    		int data; 
    		Node next; 
             	Node(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
    	}
    	
    	Node head; 
    	CLL()   
    	{ 
    		head = null; 
    	} 
    	
    	void sortedInsert(int data) 
    	{  
    		Node new_node= new Node(data); 
        		Node last = head; 
        		if (last == null) 
        		{ 
            			new_node.next = new_node; 
            			head = new_node; 
        		} 
        		else if (last.data >= new_node.data) 
        		{ 
        			while (last.next != head) 
                			last = last.next; 
        			last.next = new_node; 
            		new_node.next = head; 
            		head = new_node; 
        		} 
        		else
        		{
        			while (last.next != head && last.next.data < new_node.data) 
                			last = last.next; 
        				new_node.next = last.next; 
            			last.next = new_node; 
        		} 
	}
    	
    	
    	void printList() 
    	{ 
        		if (head != null) 
        		{ 
            			Node temp = head; 
            			do
            			{ 
                			System.out.print(temp.data + " "); 
                			temp = temp.next; 
            			}  while (temp != head); 
        		} 
    	}
    	
    	public static void main(String[] args) 
    	{ 
        		CLL list = new CLL(); 
        		int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
        		Node temp = null; 
        		for (int i = 0; i < 6; i++) 
        		{ 
           			
            		list.sortedInsert(arr[i]); 
        		} 
        			list.printList(); 
    	}		 
}
