package collection;
import java.io.*; 
import java.util.*; 

public class Student {
public static void main(String args[]) {
	int arr[]=new int[4];
	Vector<Integer> v=new Vector();
	Hashtable<Integer,String> h=new Hashtable();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of student details you want to enter:");
	int i=s.nextInt();
	for(int j=1;j<=i;j++) {
		System.out.println("Enter name of student :");
			String k=s.next();
	h.put(j,k);
	}
	for(int j=1;j<=i;j++) {
		System.out.println(h.get(j));
	}
}
}
