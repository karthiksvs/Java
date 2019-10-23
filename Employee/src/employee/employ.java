package employee;

public class employ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp e=new emp();
e.setName("Ram");
e.setSur_name("s.");
e.setAddr("Hyderabad");
e.setSal(15000);
System.out.println("1."+e.getAddr()+"   "+e.getSal());
long s=e.getSal();
tmp_emp t=new tmp_emp();
t.s(24,12,s);
ft_emp f=new ft_emp();
f.s(1500,s);

e.setName("shyam");
e.setSur_name("b.");
e.setAddr("banglore");
e.setSal(1500);
System.out.println("2."+e.getAddr()+"   "+e.getSal());
t.s(24,15,s);
f.s(1200,s);

e.setName("Raghu");
e.setSur_name("m.");
e.setAddr("Hyderabad");
e.setSal(13000);
System.out.println("3."+e.getAddr()+"   "+e.getSal());
t.s(24,19,s);
f.s(10000,s);

e.setName("Ricky");
e.setSur_name("s.");
e.setAddr("Hyderabad");
e.setSal(25000);
System.out.println("4."+e.getAddr()+"   "+e.getSal());
t.s(24,22,s);
f.s(2500,s);

	}

}
class emp{
	String name;
	String sur_name;
	String addr;
	long sal;
	emp(){
		this.name=name;
		this.sur_name=sur_name;
		this.addr=addr;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSur_name() {
		return sur_name;
	}
	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
}
class tmp_emp extends emp{
	int ndw;
	int nwm;
	public void s(int ndw, int nwm,long sal) {
		float r;
		r=(ndw*sal)/nwm;
		System.out.println(r);
	}
}
class ft_emp extends emp{
	int pf;
	public void s(int pf,long s) {
		float r;
		r=(s+((pf*s)/100));
		System.out.println(r);
	}
}