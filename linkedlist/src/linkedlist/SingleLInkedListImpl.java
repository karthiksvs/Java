package linkedlist;

public class SingleLInkedListImpl {
	
	Node head,tail;
	static int count=0;
	
	
	public void add(int data) {
		
		Node ob=new Node();
		ob.data=data;
		ob.next=null;
		
		if(head==null && tail==null) {
			head=ob;
			tail=ob;
			count=count+1;
		}
		
		else {
			tail.next=ob;
			tail=tail.next;
			count=count+1;
		}
	}
	
	public void addst(int data) {
		Node ob=new Node();
		ob.data=data;
		ob.next=head;
		Node temp=head;
		head=ob;
		count=count+1;
		tail=ob.next;
		while(tail!=null) {
			tail=tail.next;
	}
	}
	public void insertAtMiddle(int data){

		   Node newNode=new Node();
		   newNode.data=data;

		   Node temp = head;
		   Node current = null;
		   int count1=count/2;

		   for(int i = 0; i < count1; i++) {
		      //Node current will point to temp
		      current = temp;
		      //Node temp will point to node next to it.
		      temp = temp.next;
		   }

		   //current will point to new node
		   current.next = newNode;
		   //new node will point to temp
		   newNode.next = temp;
		   System.out.println(count1);
		   count1++;
		}
	public void delst() {
		Node ob=new Node();
		ob.next=head.next;
		head=ob.next;
		tail=head.next;
		count=count-1;
		while(tail!=null) {
			tail=tail.next;
	}
	}
	public void dellt() {
		   Node newNode=new Node();
		   Node temp = head;
		   Node current = null;
		   //int count1=count/2;

		   for(int i = 0; i < count-1; i++) {
		      //Node current will point to temp
		      current = temp;
		      //Node temp will point to node next to it.
		      temp = temp.next;
		   }

		   //current will point to new node
		   current.next = temp.next;
		   newNode.next=null;
		   //new node will point to temp
		   //System.out.println(count1);
		}


	public void delAtMiddle(){

		   Node newNode=new Node();
		   Node temp = head;
		   Node current = null;
		   int count1=count/2;

		   for(int i = 0; i < count1; i++) {
		      //Node current will point to temp
		      current = temp;
		      //Node temp will point to node next to it.
		      temp = temp.next;
		   }

		   //current will point to new node
		   current.next = temp.next;
		   //new node will point to temp
		   newNode.next=temp;
		   //System.out.println(count1);
		   count1++;
		}

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
