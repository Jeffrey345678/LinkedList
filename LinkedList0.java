package populate0;

//import LinkedList2.Node2;

//import java.util.Scanner;

public class LinkedList0{
	
	Node0 head;
	
	
		
		
		
		public void append(String line)
		{
			if (head == null)
			{
				head = new Node0(line);
				return;
			}
			Node0 current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new Node0(line);
		}
	
	
		public int length()
		{
		int len = 1;
		if (head == null) return len - 1;
		Node0  current = head;
		while (current.next != null)
		{
			len++;
			current = current.next;
		}
		System.out.println(len + ": number of cells in the list.");
		return len;
		}
		
		
		
		
		
		
		public void printList()
		{
			Node0 current = head;
			System.out.print("List: ");
			while (current != null)
			{
				System.out.print(  current.vlue + ", ");
				current = current.next;
			}
			System.out.println("");
		}

		
		
		
		public void searchList(String searchvalue)
		{
		 
	        
			String result = "Not found";
			
		    if (head == null) { 
		    	System.out.println("List Empty");
		    }
		    
		    Node0 current = head;
		    
		    if (head.vlue == searchvalue)
		    {
		        result = "Value: " + head.vlue;
		    }
		    else
		    {
		    	while (current.next != null)
		        {
		            if (current.next.vlue == searchvalue)
		            {
		                result = "Value: " + current.next.vlue; 
		               
		                break;
		            }
		            current = current.next;
		        }
		    }
		    System.out.println(result);
		   
		}
		
		
		public void append()
		{
			String input = "544509"; // value you want to move to the end of the LL
			
			if (head == null)
			{
				head = new Node0(input);
				return;
			}
			Node0 current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new Node0(input);
		}
		
		
		
		
		 
		
		
}
