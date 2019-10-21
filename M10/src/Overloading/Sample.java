package Overloading;

public class Sample {
	public static void main(String args[]) {
		a c=new a();
		b o=new b();
		o.sum(2,3);
		o.sum(2, 6);
		
	}
}
	class a{
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	}
 class b extends a{
	 public void sum(int a,int b) {
			float sum=a+b;
			System.out.println("b"+sum);
		}
		
	}
	
