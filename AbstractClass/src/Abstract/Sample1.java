package Abstract;
class A {
     public int i;
	      public int j;
	    }    
	    class B extends A {
	        int j;
	        void display() {
	            super.j = 3;
	            System.out.println(i + " " + j);
	        }
	    }    
	    class Sample1 {
	        public static void main(String args[])
	        {
	        	B obj = new B();
	            obj.i=1;
	            obj.j=2;   
	            obj.display();     
	        }
	   }
