import java.util.*;

public class User {
	String userName;
	User connections[];
	int count;

	public User(String name, Object size[])
	{
		// TODO Auto-generated constructor stub
		this.userName=name;
		if(size!=null) {
			this.connections=(User[]) size;
		}
	}
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User[] getConnections() {
		return connections;
	}

	public void setConnections(User[] connections) {
		this.connections = connections;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public void addConnection(User a,User u) {
		//System.out.println("==="+u);
		User temp[]=a.connections;
		int tsize=temp.length;
		a.connections=new User[tsize+1];
		int i=0;
		for(i=0;i<tsize;i++) {
			a.connections[i]=temp[i];
		}
		a.connections[i]=u;
		count++;
	}
	@Override
	public String toString()
	{
		String s="[";
		if(connections!=null) {
			for(int i=0;i<connections.length;i++) {
				if(connections[i].getUserName()!=null) {
					s=s+connections[i].getUserName()+", ";
				}
			}
			s=s+"]";
		}
		else {
			s="";
			return userName +" : ";
		}
		s=s.substring(0,s.length()-3);
		s=s+"]";
		return  userName +" : "+ s;
	}
}