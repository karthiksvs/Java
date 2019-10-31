package S_L;

import java.util.Random;
import java.util.Scanner;
//using methods
class Tester{
 int run() {
		Random rn = new Random();
		int ans = rn.nextInt(6) + 1;
		return ans;
		// TODO Auto-generated method stub
	}
 int kill(int a) {
	int user[]=new int[]{15,28,36,44,51,65,71,76,88,96};
	for(int ar=0;ar<user.length;ar++) {
		if(a==15) {
			a=a-6;
			break;
		}
		else if(a==28) {
			a=a-9;
			break;
		}
		else if(a==36) {
			a=a-14;
			break;
		}
		else if(a==44) {
			a=a-11;
			break;
		}
		else if(a==51) {
			a=a-27;
			break;
		}
		else if(a==65) {
			a=a-60;
			break;
		}
		else if(a==71) {
			a=a-45;
			break;
		}
		else if(a==76) {
			a=a-49;
			break;
		}
		else if(a==88) {
			a=a-68;
			break;
		}
		else if(a==96) {
			a=a-56;
			break;
		}
	}
	
	return a;
}
	 int ladd(int a) {
		int ld[]=new int[]{8,23,32,48,66,74,89};
		for(int ar=0;ar<ld.length;ar++) {
			if(a==8) {
				a=a+6;
				break;
			}
			else if(a==23) {
				a=a+9;
				break;
			}
			else if(a==32) {
				a=a+14;
				break;
			}
			else if(a==48) {
				a=a+19;
				break;
			}
			else if(a==66) {
				a=a+29;
				break;
			}
			else if(a==74) {
				a=a+18;
				break;
			}else if(a==89) {
				a=a+9;
				break;
			}

	}
		return a;
}
}
 class type2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usr[]=new int[10];
		Random rn = new Random();
		int co=1;
		//int ans = rn.nextInt(6) + 1;
		System.out.println("Enter number of users who want to play in limit of 1-4");
		Scanner s=new Scanner(System.in);
		int us=s.nextInt();
		Tester t=new Tester();
		for(int i=1;i<=us;i++) {
		usr[i]=0;
		}
		while(co!=100) {
		if(us!=0 && us<=4) {
		for(int i=1;i<=us;i++) {
			int ans = rn.nextInt(6) + 1;
			if(ans==1 || usr[i]!=0) {
				int a=t.run();
				a=t.kill(a);
				a=t.ladd(a);
			if(usr[i]<101) {
				if(a==6) {
				a=t.run();
				usr[i]=usr[i]+a;
				System.out.println("User "+i+"score"+usr[i]);
				}
				else {
					usr[i]=usr[i]+a;
				}
			}
			}
			if(usr[i]==100) {
				System.out.println("User "+i+"score"+usr[i]+"is the winner");
				co=100;
				break;
			}
		}
		}
		else {
			System.out.println("More than 4 players cant play or below 1 player cant play the game");
		}
		}
			}

		}
