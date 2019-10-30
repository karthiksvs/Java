package shoppingcart;

public class scart {
	   int pid;
	   String pname;
	   String qua;
	   float price;
	   

		public scart(int pid,String pname,String qua,float price) {
	   this.pid=pid;
	   this.pname=pname;
	   this.qua=qua;
	   this.price=price;
	    }

	    public int getpid() {
		return pid;
	}

	public void setpid(int pid) {
		this.pid = pid;
	}

	public String getpname() {
		return pname;
	}

	public void setpname(String pname) {
		this.pname = pname;
	}

	public String getqua() {
		return qua;
	}

	public void setqua(String qua) {
		this.qua = qua;
	}

	public float getprice() {
		return price;
	}

	public void setprice(float price) {
		this.price = price;
	}
	@Override
    public String toString() {
        return "Cart{" +
    "product id" + pid +" \n"+"product name=" + pname + " \n" +"product quantity"+qua+"\n "+"Product price"+price+" \n";
    }

}
