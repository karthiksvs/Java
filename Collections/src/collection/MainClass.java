package collection;
class X{
	static void staticMethod() {
		System.out.println("Class X");
	}
}
class Y{

	static void staticMethod() {
		System.out.println("Class Y");
	}
}
public class MainClass {
public static void main(String args[]) {
	Y.staticMethod();
}
}
