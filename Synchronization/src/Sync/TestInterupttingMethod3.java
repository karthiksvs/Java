package Sync;

class TestInterupttingMethod3 extends Thread{  
	  
public void run(){  
for(int i=1;i<=5;i++)  
System.out.println(i);  
}  
public static void main(String args[]){  
	TestInterupttingMethod3 t1=new TestInterupttingMethod3();  
t1.start();  
  
t1.interrupt();  
  
}  
}  