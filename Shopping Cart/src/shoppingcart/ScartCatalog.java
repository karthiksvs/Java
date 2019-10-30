package shoppingcart;

import java.text.ParseException;
import java.util.Scanner;

public class ScartCatalog {
	int[] pid;
	   String[] pname;
	   String[] qua;
	   float[] price;
	   static int count=0;
	   scart pr[];
	   
	   ScartCatalog() {
		  
	   this.pid=new int[30];
	   this.pname=new String[30];
	   this.qua=new String[30];
	   this.price=new float[30];
	   this.pr=new scart[30];
	    }
	    public void atask(scart p) {
	        pid[count] = p.pid;
	        pname[count] = p.pname;
	        qua[count] = p.qua;
	        price[count] = p.price;
	        pr[count]=p;
	        count++;
	        System.out.println(count);
	       	    }

	    public void removet(String t) {
	        for (int i = 0; i < count; i++) {
	            if (pr[i].getpname().equals(t) || pr[i].equals(null)) {
	                pr[i] = null;
	                count = count - 1;
	            } else
	                System.out.println(pr[i]);
	        }
	    }
	    public void catalog(){
	        for (int i = 0; i < count; i++) {
	            if(!(pr[i].equals(null)))
	                System.out.println(pr[i]);
	        }
	    }
	    public void sea() throws ParseException {
	        System.out.println("1 product name\n 2 product id \n 3 quality \n 4 price\n");
	        System.out.println("choose the field you want to search by:");
	        Scanner s = new Scanner(System.in);
	        int s1 = s.nextInt();
	        switch (s1) {
	            case 1:
	                System.out.println("Enter name");
	                String s3 = s.next();
	                for (int i = 0; i < count; i++) {
	                    if (pr[i].getpname().equals(s3)) {
	                    	System.out.println(pr[i]);
	                    }
	                }
	                break;
	            case 2:
	            	System.out.println("Enter id");
	                int s2 = s.nextInt();
	                for (int i = 0; i < count; i++) {
	                    if (pr[i].getpid()==(s2)) {
	                    	System.out.println(pr[i]);
	                    }
	                }
	                break;
	            case 3:
	            	System.out.println("Enter quality");
	                String s4 = s.next();
	                for (int i = 0; i < count; i++) {
	                    if (pr[i].getqua().equals(s4)) {
	                    	System.out.println(pr[i]);
	                    }
	                }
	                break;
	            case 4:
	            	System.out.println("Enter price");
                float s5 = s.nextFloat();
                for (int i = 0; i < count; i++) {
                    if (pr[i].getprice()==(s5)) {
                    	System.out.println(pr[i]);
                    }
                }
                break;
                default:
	                System.out.println("Choosen wrong option");
	        }

	    }
	    void coupon(int coup) {
	    	 System.out.println("Enter product name to which coupon must be applied");
	    	 Scanner s = new Scanner(System.in);
             String s3 = s.next();
             for (int i = 0; i < count; i++) {
                 if (pr[i].getpname().equals(s3)) {
            float f=pr[i].getprice();
            float f1=(f/100)*coup;
            float f2=f-f1;
            pr[i].setprice(f2);
	    }
             }
	    }

}
