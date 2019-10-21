package Overloading;

public class Calculator {
	public int add(int a, int b)

	{
		int sum=a+b;
		return sum;
	}

	public float add(float a, float b)

	{
		float sum=a+b;
		return sum;
	}
	public boolean add(boolean a, boolean b)

	{
		if(a==true && b==true)
			return true;
		else if(a==true && b==false)
			return false;
		else if((a==true || b==true)||(a==true || b==false)||(a==false || b==true))
			return true;
		else
			return false;
	}
	public String add(String a, String b)

	{
		String sum=a+b;
		return sum;
	}
	public double add(double a, double b)

	{
		double sum=a+b;
		return sum;
	}
	public long add(long a, long b)

	{
		long sum=a+b;
		return sum;
	}

	public static void main(String args[]) {
		Calculator c=new Calculator();
		System.out.println(c.add(2, 3));
		System.out.println(c.add(2.4, 3.6));
		System.out.println(c.add("hello", "World"));
		System.out.println(c.add(231456,789456));
		System.out.println(c.add(23.21456, 35.214569));
		System.out.println(c.add(true, false));
	}

}
