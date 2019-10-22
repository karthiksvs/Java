package Abstract;

abstract class Shape {
	final double PI=3.14;
	public void areaandperimeter(int n1) {
	}
	public void display() {
		//System.out.println("Shape");
		
	}

}
    class Triangle extends Shape {
    	public void areaandperimeter(int n1,int n2,int n3) {
    	}
    	public void display() {
    		System.out.println("Triangle");
    	}
        }
    class Circle extends Shape{
    	public void areaandperimeter(int n1) {
    		int n=(int) (n1*PI*n1);
			System.out.println("Area of circle  is :"+n);
			int p=(int) (2*PI*n1);
			System.out.println("Perimeter of circle  is :"+p);
			
	}
    	public void display() {
    		System.out.println("Circle");
    	}
    }
    class Isoceles extends Triangle{
    	public void areaandperimeter(int n1,int n2,int n3) {
    			int n=2*n1+n2;
    			System.out.println("Area of iscoles triangle is :"+n);
    			int p=n1+n2+n3;
    			System.out.println("Perimeter of iscoles triangle is :"+p);
    			
    	}

    	public void display() {
    		System.out.println("Isoceles Triangle");
    	}
    	
    }
class Equilateral extends Triangle{
	public void areaandperimeter(int n1,int n2,int n3) {
		int n=3*n1;
		System.out.println("Area of Equilateral triangle is :"+n);
		int p=n1+n2+n3;
		System.out.println("Perimeter of Equilateral triangle is :"+p);
		
}
	public void display() {
		System.out.println("Equilateral Triangle");
	}
    }

 class Quadrilateral extends Shape {
	 public void areaandperimeter(int n1,int n2) {
	 }
 	public void display() {
 		System.out.println("Quadrilateral");
 	}
}
    class Rectangle extends Quadrilateral {
    	public void areaandperimeter(int n1,int n2) {
			int n=n2*n1;
			System.out.println("Area of rectangle  is :"+n);
			int p=2*n1+2*n2;
			System.out.println("Perimeter of rectangle  is :"+p);
			
	}
    	public void display() {
    		System.out.println("Rectangle");
    	}
        }
    class Square extends Quadrilateral{
    	public void areaandperimeter(int n1,int n2) {
			int n=n1*n1;
			System.out.println("Area of square  is :"+n);
			int p=4*n1;
			System.out.println("Perimeter of square  is :"+p);
			
	}
    	public void display() {
    		System.out.println("Square");
    	}
    	
    }
    class Rhombus extends Quadrilateral{
    	public void areaandperimeter(int n1,int n2) {
			double n=(0.5)*n1*n2;
			System.out.println("Area of rhombus  is :"+n);
			int p=4*n1;
			System.out.println("Perimeter of rhombus  is :"+p);
			
	}
    	public void display() {
    		System.out.println("Rhombus");
    	}
    }
    class Sample {
        public static void main(String args[])
        {
            Triangle t=new Isoceles();
           t.display();
           t.areaandperimeter(5,15,25);
           Triangle t1=new Equilateral();
           t1.display();
           t1.areaandperimeter(5, 5, 5);
           Quadrilateral q=new Rectangle();
           q.display();
           q.areaandperimeter(6, 8);
           Quadrilateral q1=new Square();
           q1.display();
           q1.areaandperimeter(8,6);
           Quadrilateral q2=new Rhombus();
           q2.display();
           q2.areaandperimeter(5,15);
           Shape s=new Circle();
           s.display();
           s.areaandperimeter(5);
        }
   }