package file;
	import java.io.DataOutputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Scanner;
	 
	public class nonprimef {
	 
	  public static void main(String[] args) {
	   String strFilePath = "C://Users//karthik//eclipse-workspace//Files//npf.txt";
	   try
	    {
	      FileOutputStream fos = new FileOutputStream(strFilePath);
	     
	       DataOutputStream dos = new DataOutputStream(fos);
	       boolean isPrime = true;
	       int count=0;
	       System.out.println("Enter size of prime numbers you want:");
	       Scanner s=new Scanner(System.in);
	       int m=s.nextInt();
	       for (int j = 1; j <= m; j++) {
	    	   int arr[]=new int[m];
	    	   int l=0;
	    	   int remainder=0;
	    	   isPrime = CheckPrime(j);
	    	   if (!isPrime) {
	    		   System.out.print(j+"-  ");
	    		   count++;
	    	for (int i = 1; i <= j ; i++) {
	          remainder = j % i;
	          if (remainder == 0) {
	        	  arr[l]=i;
	        	  l++;
	          }
	    		   }
	    	for(int n=0;n<l;n++) {
	    		System.out.print(arr[n]+" ");
	    		   dos.writeInt(arr[n]);
	    	        }
	    	System.out.println();
	       }
	       }
	       System.out.println();
	       System.out.println("The number of non primes are:"+count);
	       System.out.println("The number of primes are:"+(m-count));
	       System.out.println("Inserting into file completed");
	        dos.close();
	    }
	    catch (IOException e)
	    {
	      System.out.println("IOException : " + e);
	    }
	 }
	  public static boolean CheckPrime(int numberToCheck) {
	      int remainder;
	      for (int i = 2; i <= numberToCheck / 2; i++) {
	          remainder = numberToCheck % i;
	          if (remainder == 0) {
	              return false;
	          }
	      }
	      return true;

	  }


	}