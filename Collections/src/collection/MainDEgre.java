package collection;
class Degree{
	void getd() {
		System.out.println("i got a degree");
	}
}
class UndergraduateDegree extends Degree{
	void getd() {
		System.out.println("i got a UGdegree");
	}
}
class PostgraduateDegree extends Degree{
	void getd() {
		System.out.println("i got a PGdegree");
	}
}
public class MainDEgre {
public static void main(String args[]) {
	Degree d=new UndergraduateDegree();
	d.getd();
	Degree d1=new PostgraduateDegree();
	d1.getd();
	Degree d2=new Degree();
	d2.getd();
}
}
