package file;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class Writetofile2 {
	  public static void main(String[] args) {
	    	try{  
	    	    FileInputStream fin=new FileInputStream("sample2.txt");  
	    	    int i=0;  
	    	    FileWriter myWriter = new FileWriter("sample3.txt");
	    	    System.out.println("Enter any character to be searched:");
	    	    Scanner x=new Scanner(System.in);
	    	    String d=x.next();
	    	      String s="";
	    	      int cou=0;
	    	      String arr[]=new String[100];
	    	      int l=0;
	    	      int co=0;
	    	      char d1=d.charAt(0);
	    	    while((i=fin.read())!=-1){  
	    	    	char o=(char)i;
	    	    	char g=o;
	    	    	if(d1==g){
	    	    		cou=cou+1;
	    	    		}
	    	    	s=s+(char)i;
	    	    	s.toLowerCase();
	    	    	if((char)i==' ') {
	    	    		arr[l]=s;
		    	    	l=l+1;
		    	    	 s="";
		    	    	 co=co+1;
	    	    	}  
	    	    } 
	    	    int t=0;
	    	    String arr1[]=new String [100];
	    	    for(int z=0;z<l;z++) {
	    	    	 int count=0;
	    	    	//System.out.println(arr[z]);
	    	    	for(int y=z;y<l;y++) {
	    	    		String q=arr[z];
	    	    		String f=arr[y];
	    	    		if(q.equals(f)) {
	    	    			count=count+1;
	    	    			if(count>=2) {
	    	    				arr[y]=" ";
	    	    	    	}
	    	    		}
	    	    	}
	    	    	if(count<2) {
	    	    		arr1[t]=arr[z];
	    	    		t=t+1;
	    	    	}
	    	    	
	    	    }
	    		for(int w=0;w<t;w++) {
	    	    	System.out.println(arr1[w]);
	    	    	if(arr1[w]!=" ") {
	    	    	 myWriter.write(arr1[w]);
	    	    	}
	    		}
//	    	    FileInputStream myWriter1 = new FileInputStream("sample1.txt");
//	    	    while((i=myWriter1.read())!=-1){  
		    	     System.out.println("Number of words are:"+co);
		    	     System.out.println("Number of times a letter repeating:"+cou);
		    	     
	    myWriter.close();
	    	  fin.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}