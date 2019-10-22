package interfaces;

import java.util.Random;
import java.util.Scanner;

/*
The goal of this assignment is to implement a limited multiple inheritance of Java. You know that the code for a sub-class 
should be able to access information in any of its super-classes. You have already created two 
classes MSITStudent, MSITMentor as a part of previous assignment. A TA (Teaching assistant) class 
extends both the MSITStudent and MSITMentor.

Create interfaces of MSITStudent and MSITMentor by adding some more functionalities 
getGPA()(this function allows the student to get a grade [A,B,C,D]from stdin) and 
getSalary() allows the Mentor to get his salary from stdin). For example, 
according to previous module MSITStudent class may have a getGPA() method which does not apply to MSITMentor objects, 
and the MSITMentor class may have a getSalary() method which does not apply to MSITStudent objects.
 However, getGPA() and getSalary() are both valid methods for an instance of the TA class. 
 So we recommend you to create and implement two interfaces one is MSITMentor and the other one is MSITStudent with above mentioned methods.
  Now create a TA class that implements MSITStudent and MSITMentor.
*/
interface MSITStudents{
	void getGPCA();
}
interface MSITMentor{
	void getSalary();
}
class MSITStudent implements MSITStudents,MSITMentor
{
	
	String studentName;
	int StudentNumber;
	int whichMiniSem;
	 public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String s=sc.next();
			System.out.println("Enter Number");
			int si=sc.nextInt();
			System.out.println("Enter MinSem");
			int ms=sc.nextInt();
			MSITStudent stu=new MSITStudent();
			boolean e=stu.isEligibility();
			if(e==true) {
				stu.getGPCA();
				System.out.println("Name is "+s+"Number is"+si+"Mini Sem"+ms);
			}
			else {
				System.out.println("Student is not eligible");
				System.out.println("Do you want insert salary for Mentor Y?N");
				String c=sc.next();
				if(c.equals("Y")) {
					//System.out.println("Entered");	
					stu.getSalary();
				}
			}
		}	
	static boolean isEligibility()
	{
             boolean isEligible;
		Random rand=new Random();
		isEligible=rand.nextBoolean();
		return isEligible;
	}

     @Override
 	public void getSalary() {
 		// TODO Auto-generated method stub
 		System.out.println("Enter Salary ");
 		Scanner s= new Scanner(System.in);
 		long l=s.nextLong();
 		System.out.println("Salary is"+l);
 	}

 	@Override
 	public void getGPCA() {
 		// TODO Auto-generated method stub
 		System.out.println("Enter GPCA");
 		Scanner s= new Scanner(System.in);
 		String i=s.next();
 		System.out.println("GPCA is"+i);
 	}
}
