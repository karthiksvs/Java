package linkedlist;

import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		SingleLInkedListImpl ob=new SingleLInkedListImpl();
		int c=0;
		while(c!=8) {
			System.out.println("1.add data\n2.add data as head \n3.display\n4.add elemnt in middle\n5.del node in start\n6.del last element\n7.del middle \n8.exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter data size to add");
			int a=sc.nextInt();
			int b=0;
			for(int i=0;i<a+b;i++) {
				
				System.out.println("enter data");
				int data=sc.nextInt();
				ob.add(data);
			}
			b=b+a;
			break;
		case 2:
			System.out.println("Enter data to add in start");
			int dat=sc.nextInt();
			ob.addst(dat);
			break;
		case 3:
			ob.display();
			break;
		case 4:
			System.out.println("Enter data to add in middle");
			int d=sc.nextInt();
			ob.insertAtMiddle(d);
			break;
		case 5:
			ob.delst();
			break;
		case 6:
			ob.dellt();
			break;
		case 7:
			ob.delAtMiddle();
			break;
		case 8:
			c=8;
			System.out.println("end of program");
			System.exit(0);
			break;
		}
		}
		
	}

}
