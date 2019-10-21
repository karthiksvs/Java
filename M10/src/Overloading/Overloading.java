package Overloading;

public class Overloading {
		public void printData(int a)
		{
			System.out.println(a);

		}
		public void printData(double a)
		{
			System.out.println(a);

		}
		public void printData(float a)
		{
			System.out.println(a);

		}
		public void printData(char a)
		{
			System.out.println(a);

		}
		public void printData(boolean a)
		{
			System.out.println(a);

		}
		public void printData(String a)
		{
			System.out.println(a);

		}
		public void printData(long a)
		{
			System.out.println(a);

		}
public static void main(String args[]) {
Overloading o=new Overloading();
o.printData(2);
o.printData(123456);
o.printData("kar");
o.printData(true);
o.printData('h');
o.printData(2.6);
o.printData(23.1456789);
}
}