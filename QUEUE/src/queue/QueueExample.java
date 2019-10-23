package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>(); 
		  System.out.println("Enter number of elements you want to add in queue:");
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  System.out.println("Enter elements of queue:");
	    // Adds elements {0, 1, 2, 3, 4} to queue 
	    for (int i=0; i<n; i++) {
	     int k=s.nextInt();
	    	q.add(k); 
	    }
	    // Display contents of the queue. 
	    System.out.println("Elements of queue-"+q); 
	  
	    // To remove the head of queue. 
	    int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	  
	    System.out.println(q); 
	  
	    // To view the head of queue 
	    int head = q.peek(); 
	    System.out.println("head of queue-" + head); 
	  
	    // Rest all methods of collection interface, 
	    // Like size and contains can be used with this 
	    // implementation. 
	    int size = q.size(); 
	    System.out.println("Size of queue-" + size);
	}

}
