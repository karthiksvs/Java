package collection;
class A {
		int i=10;
		//System.out.println(1);
}
class B extends A{
		
			int i=20;
			//System.out.println(2);
}
		class C extends A{
			{
				System.out.println(3);
			}
		}
public class sample {
public static void main(String args[]) {
A c=new B();
System.out.println(c.i);
}
}
