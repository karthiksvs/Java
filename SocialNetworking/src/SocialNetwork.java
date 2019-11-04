/**
 * This class implements all the methods of the SocialNetrorkInterface
 * You are free to add your own behaviours to this class.
 *
 * @author Siva Sankar
 */

import java.util.Arrays;

public class SocialNetwork {

	/**
	 * users indicates the actual users in the network
	 */
	User[] users;

	/**
	 * The size indicates the numebr of users in the network
	 */
	int size;

	/**
	 * Initializes the default values of the social network.
	 */
	public SocialNetwork() {
		// TODO
		// Your code goes here
	}

	/**
	 * This method takes the string as a parameter which is used to create a
	 * network. do nothing if the string is empty.
	 *
	 * @param str to be used to create a network.
	 */
	public void createDataStructure(String str) {
		// TODO
		// Your code goes here
		if (str != null) {
			System.out.println("in create data structure");

			String net[] = str.split(";");

			users = new User[100];

			for (int i = 0; i < net.length; i++) {
				// System.out.println(net[0]);
				StringBuilder br = new StringBuilder(net[i]);
				int n = br.indexOf("is connected to");
				if (n != -1) {
					String name = br.substring(0, n);
					String connections = br.substring(n + 16, br.length());

					// System.out.println("name + "+ name);
					// System.out.println("connections + "+ connections);
					name = name.trim();
					User ob = getUser(name);
					User cons[] = null;
					String[] userConnections;
					if (ob == null) {
						User u = new User(name, null);
						addUser(u);

						userConnections = connections.split(",");
						cons = new User[userConnections.length];
						for (int j = 0; j < userConnections.length; j++) {

							// System.out.println(userConnections[j]);
							if (userConnections[j] != null) {

								User connected_user = getUser(userConnections[j].trim());

								if (connected_user == null) {
									User newUser = new User(userConnections[j].trim(), null);
									addUser(newUser);
									cons[j] = newUser;
									// addConnection(u,newUser);
								}
							}

						}

						u.connections = cons;

					} else {
						userConnections = connections.split(",");

						cons = new User[userConnections.length];
						for (int j = 0; j < userConnections.length; j++) {

							User newUser=getUser(userConnections[j].trim());
							if(newUser==null) {
								//System.out.println("New "+userConnections[j].trim());
								newUser= new User(userConnections[j].trim(), null);
								cons[j] = newUser;
								addUser(newUser);
							}
							else {
								//System.out.println("existing "+newUser.getUserName());
								cons[j] = newUser;
							}




						}

						ob.connections = cons;

						// System.out.println("=======================eleeeeeeeeeeeeeeeee========");
					}
				}

			}
		}

		return;
	}

	private boolean searchUser(User user) {
		for (int i = 0; i < size; i++) {
			if (user.equals(users[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Please don't modify the follwoing code. This method returns the User based on
	 * the userName.
	 *
	 * @param userName the string to be used to search for the user.
	 * @return the User object based on the userName. Returns null otherwise
	 */
	public User getUser(String userName) {

		for (int i = 0; i < size; i++) {
			// System.out.println("in getUser " +users[i].getUserName());
			String s = users[i].getUserName();

			userName = userName.trim();
			s = s.trim();
			// System.out.println("s : "+s + " userName : "+userName + s.equals(userName));
			if (userName.equals(s)) {
				// System.out.println("======================== "+userName);
				return users[i];
			}
		}
		return null;
	}

	/**
	 * This method adds a new User (object) that is passed as argument to the social
	 * network if the user is not currently on the social network.
	 *
	 * @param userA to be added to the social network.
	 */
	public void addUser(User userA) {
		// TODO
		// Your code goes here

		// System.out.println(users.length);
		System.out.println("size "+size);
		User u=getUser(userA.getUserName());
		if(u==null) {
			users[size] = userA;
			System.out.println(users[size].getUserName());
			size++;
		}

		return;
	}

	/**
	 * This method takes two users (objects) as arguments and connects them on the
	 * network. userA and userB are the users that are passed as parameters to this
	 * function, then add userB to userA’s connections
	 *
	 * Note: Both userA and userB should be there on the network. if anyone of them
	 * are not on the network, then do nothing.
	 *
	 * @param userA the userB is to be added to userA connections
	 * @param userB to be added to userA connections
	 */
	public void addConnection(User userA, User userB) {
		// TODO
		// Your code goes here
		try {
		if(userA!=null && userB!=null) {
			userA.addConnection(userA, userB);
		}
		}catch(Exception e) {
			
		}
	}

	/**
	 * This method takes a user object as an argument that returns the connections
	 * of this user. Return null if the user is not in the network.
	 *
	 * @param userA the user object used to return the connections of this user.
	 *
	 * @return the list of connections of userA. otherwise return null
	 */
	public User[] getConnections(User userA) {
		// TODO
		// Your code goes here

		if(userA==null) {
			return null;
		}
		User[] ar;
		if(userA!=null)
		{
			if(userA.connections!=null) {
				if (userA.connections.length > 0) {
					ar = new User[userA.connections.length];
					for (int i = 0; i < userA.connections.length; i++) {
						ar[i] = getUser(userA.connections[i].getUserName());
					}
					return ar;
				}
			}

		}

		return null;
	}

	/**
	 * This method returns the common connections of userA and userB. Note: both
	 * userA and userB should be on the network. if anyone of them is not in the
	 * network, then return null
	 *
	 * @param userA the first user
	 * @param userB the second user
	 *
	 * @return the common connections of both userA and userB if they both are in
	 *         the network, otherwise return null
	 */
	public User[] getCommonConnections(User userA, User userB) {
		// TODO
		// Your code goes here
		if(userA==null || userB==null) {
			//User arr[] = {};
			return null;
		}
		System.out.println("in common");
		String s="";
		try {
		if(userA!=null && userB!=null) {
			for(int i=0;i<userA.connections.length;i++) {
				User temp=userA.connections[i];
				for(int j=0;j<userB.connections.length;j++)
				{
					User tempb=userB.connections[j];
					if(temp.getUserName().equals(tempb.getUserName())) {
						s=s+temp.getUserName()+",";
					}
				}
			}
		}
		}catch(Exception e) {
			
		}
		String ar[]=s.split(",");
		//System.out.println(ar[0]);
		User[] common=new User[ar.length];
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			flag=true;
			common[i]=getUser(ar[i]);
		}
		//User[] common=new User[];
		if(flag) {
			return common;
		}
		return null;
	}

	/**
	 * This reutrns the String version of the social network.
	 *
	 * @return the String version of the network, return an empty string if there
	 *         are no users in the network.
	 */
	public String toString() {
		if (this.size == 0) {
			return "";
		}
		if(size==1) {
			return users[0].toString();
		}
		StringBuffer sb = new StringBuffer();
		int i = 0;
try {
		for (i = 0; i < size - 1; i++) {
			// System.out.println("-->"+users[i].getUserName());
			if (users[i].connections != null) {

				sb.append(users[i] + "\n");

			}
			else if(users[i].getUserName()!=null && users[i].connections == null)
			{
				sb.append(users[i] + "\n");
			}



		}
	
		//System.out.println("size "+users[size-1].getUserName());
		sb.delete(sb.length() - 1, sb.length());
		sb.append("\n"+users[i]);}catch(Exception e) {}

		// sb.append(users[i]);
		// System.out.println("========== to string =======");
		// System.out.println("----"+sb.toString());
		return sb.toString();
		
	}

}
