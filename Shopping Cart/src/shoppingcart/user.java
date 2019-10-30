package shoppingcart;

import java.text.ParseException;
import java.util.Scanner;

public class user extends product {
static int count=0;
	public user(int pid, String pname, String qua, float price) {
		super(pid, pname, qua, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] uname=new String[30];
int[] coupon=new int[] {10,20,30,40,50};
ScartCatalog c1=new ScartCatalog();
projectCatalog u=new projectCatalog();
System.out.println("Enter the name:");
Scanner s= new Scanner(System.in);
uname[count]=s.next();
String ch;
do {
	System.out.println("1 add product \n 2 remove product \n 3 search \n 4 catalog\n 5 final payment \n 6 exit");
	int op=s.nextInt();
	switch(op) {
	case 1:
		System.out.println("Enter product id:");
		int i=s.nextInt();
		System.out.println("Enter product name:");
		String s1=s.next();
		System.out.println("Enter product quality:");
		String s2=s.next();
		System.out.println("Enter product price:");
		float f=s.nextFloat();
		product p=new product(i,s1,s2,f);
		u.atask(p);
		System.out.println("Do you want this to the cart Y/N?");
        String chc=s.next();
        if(chc.equals("Y")||chc.equals("y")) {
        	scart c=new scart(p.pid,p.pname,p.qua,p.price);
        	c1.atask(c);
        }
		break;
	case 2:
		System.out.println("Enter product name:\n");
		String s3=s.next();
		u.removet(s3);
		System.out.println("Do you want delete any product from the cart Y/N?");
        String c=s.next();
        if(c.equals("Y")||c.equals("y")) {
        	System.out.println("Enter product name:\n");
    		String s5=s.next();
        c1.removet(s5);
        }
		break;
	case 3:
		try {
			u.sea();
			System.out.println("Do you want search any item from the cart Y/N?");
	        String y=s.next();
	        if(y.equals("Y")||y.equals("y")) {
	        c1.sea();
	        }
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	case 4:
		u.catalog();
		System.out.println("Do you want View the cart Y/N?");
        String y=s.next();
        if(y.equals("Y")||y.equals("y")) {
        c1.catalog();
        }
		break;
	case 5:
		System.out.println("Do you have any coupon Y/N?:");
		String cou=s.next();
		if(cou.equals("Y")||cou.equals("y")||cou.equals("Yes")) {
			System.out.println("Enter the coupon :");
			int coup=s.nextInt();
			for(int r=0;r<coupon.length;r++) {
				if(coupon[r]==coup) {
					c1.coupon(coup);
				}
			}
				
			}
			break;
	case 6:
		System.exit(0);
		default:
			System.out.println("You have choosen wrong option");
			
	}
	System.out.println("Do YOu want continue Y/N?");
	ch=s.next();
}while(ch.equals("Y")||ch.equals("y"));
	
	System.out.println("Shopping Done");
}
}