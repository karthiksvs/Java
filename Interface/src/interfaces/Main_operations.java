package interfaces;

public class Main_operations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add a=new Add();
System.out.println(a.performOperation(5,10));
Sub s=new Sub();
System.out.println(s.performOperation(6,2));
Mul m=new Mul();
System.out.println(m.performOperation(5,2));
Div d=new Div();
System.out.println(d.performOperation(10, 2));
}
}
	interface Operator{
		int performOperation(int num1, int num2);	
	}
	class Add implements Operator 
    {
        private String opString;
            public Add() {
                 opString = "+";
            }
        public int performOperation(int num1, int num2) {
            return num1 + num2;
        }
         public String getOperation() {
         return opString;
        }
    }
	 class Sub implements Operator 
    {
        private String opString;
            public Sub() {
                 opString = "-";
            }
        public int performOperation(int num1, int num2) {
            return num1 - num2;
        }
         public String getOperation() {
         return opString;
        }
    }
	class Mul implements Operator 
    {
        private String opString;
            public Mul() {
                 opString = "*";
            }
        public int performOperation(int num1, int num2) {
            return num1 * num2;
        }
         public String getOperation() {
         return opString;
        }
    }
	class Div implements Operator 
    {
        private String opString;
            public Div() {
                 opString = "/";
            }
        public int performOperation(int num1, int num2) {
            return num1 / num2;
        }
         public String getOperation() {
         return opString;
        }
    }