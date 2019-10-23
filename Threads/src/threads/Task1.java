package threads;

public class Task1 implements Runnable{
public void run() {
	for(int i=5;i>0;i--){  
	    try{
	    	Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println("Thread "+Thread.currentThread().getId()+"-"+i);  
	    
	  }
    System.out.println(Thread.currentThread().getId()+" Exiting");  
}
public static void main(String args[]){  
	  Thread t1=new Thread(new Task1());  
	  Thread t2=new Thread(new Task1());  
	  Thread t3=new Thread(new Task1());  
	  t1.start();  
	  t2.start();
	  t3.start();
//	  t1.run();
//	  t2.run();
//	  t3.run();
	 }
}
