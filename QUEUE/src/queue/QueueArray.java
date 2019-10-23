package queue;

import java.util.Scanner;

public class QueueArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Queue with arrays");
queue q=new queue();
String c;
do {
	System.out.println("Enter your choice");
	System.out.println("1. add elemnts in Queue \n2. delete elemnts in Queue \n3. display elemnts in Queue \n");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();

switch(n) {
case 1:
	q.add();
	break;
case 2:
	q.del();
	break;
case 3:
	q.dis();
	break;
	default:
		System.out.println("Choose correct option");
		System.exit(0);
}
System.out.println("Do you want to continue Y/N");
c=s.next();
}while(c.equals("Y")||c.equals("y"));
System.out.println("Queue Exit");
	}

}
class queue{
	static int a[]=new int[30];
	static int j=0;
	
	// ADD
	void add() {
System.out.println("Enter number of elemnst you want to add in queue");
Scanner s=new Scanner(System.in);
int i=s.nextInt();
System.out.println("Enter data");
int a1[]=new int[30];
int l=i;
int m=0;
try {
while(i!=0) {
	int k=s.nextInt();
	a1[m]=k;
	i=i-1;
	m=m+1;
}
i=l;
if(j==0) {
while(i!=0) {
	a[j]=a1[i-1];
	i=i-1;
	j=j+1;
}
}
else {
	int a2[]=new int[30];
	int k=0;
	while(k!=j) {
		a2[k]=a[k];
		k=k+1;
	}
	int n=i;
	int x=0;
	while(i!=0) {
		a[x]=a1[i-1];
		i=i-1;
		x=x+1;
	}	
	int w=0;
	j=j+n;
	while(n!=j) {
		a[n]=a2[w];
		w=w+1;
		n=n+1;
	}
}

System.out.println("The Queue elements are");
int n=0;
while(n!=j) {
	System.out.println(a[n]);
	n=n+1;
}
}catch(Exception e) {
	System.out.println("Array size out of bound"+e.toString());
}
finally {
	System.out.println("Completed addition");
}
	}
	
	//Delete
	void del() {
		int n=1;
		int l=0;
		int a1[]=new int[30];
		try {
		while(n!=j) {
			a1[l]=a[n];
			n=n+1;
			l=l+1;
		}
		j=j-1;
		int m=0;
		while(m!=n) {
			a[m]=a1[m];
			m=m+1;
		}
		System.out.println("The deleted Queue elements are");
		int n1=0;
		if(n1!=j) {
		while(n1!=j) {
			System.out.println(a[n1]);
			n1=n1+1;
		}
		}
		else {
			System.out.println("Queue deleted all elements");		
		}
		}catch(Exception e) {
			System.out.println("Queue is empty cant delete"+e.toString());
		}
		finally {
			System.out.println("Completed deletion");
		}

	}
	
	//Display
	
	void dis() {
		System.out.println("The Queue elements are");
		int n1=0;
		if(j!=0) {
		while(n1!=j) {
			System.out.println(a[n1]);
			n1=n1+1;
		}
		}
		else {
			System.out.println("Queue is empty ");
		}
	}
}