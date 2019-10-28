package Hangsman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static String c[]=new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static int in=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			BufferedReader fin=new BufferedReader(new FileReader("movies.txt"));  
		      String s=fin.readLine();
		      String arr[]=new String[10000];
		      String arr1[]=new String[10000];
		    while(s!=null){  
		    arr1=s.split(" ");
		    s=fin.readLine();
		    for(int ij=0;ij<arr1.length;ij++) {
		    	arr[in]=arr1[ij];
		    	in++;
		    }
		    } 
		  fin.close();
		  Random r=new Random();
	        int randomNumber=r.nextInt(arr.length);
	        //System.out.println("Successfully wrote to the file.");
	      String s1=arr[randomNumber];
	      while(s1==null && s1!=" ") {
	    	  //System.out.println(arr[randomNumber]);
	    	  randomNumber=r.nextInt(arr.length);
	    	  s1=arr[randomNumber];
	      }
	      System.out.println("Welcome to hangsman game");
	      s1=s1.toLowerCase();
	      System.out.println(arr[randomNumber]);
	      String word[]=new String[50];
	      String ne[]=new String[50];
	      for(int a=0;a<s1.length();a++) {
    		  System.out.print("_ ");
    		  word[a]=Character.toString(s1.charAt(a));
    		  ne[a]="_";
    	  }
    	  System.out.println("Guess the "+s1.length()+"letter word");
    	  int co=0;
    	  int ge=0;
    	  int siz=8;
    	  for(int b=0;b<siz;b++) {
    		  if(ge!=s1.length()) {
    		  System.out.println("You have"+siz+" chances");
    			System.out.println();
    			System.out.println("These are the words");
    		  for(int tes=0;tes<c.length;tes++) {
    		  System.out.print(c[tes]+" ");
    		  }
    		  System.out.println();
    		  System.out.println(s1.length());
    		  System.out.println("Enter a letter from above set");
     		  Scanner sc=new Scanner(System.in);
    		  String wo=sc.next();
    		  for(int te=0;te<s1.length();te++) {
    			  
    			 if(ge!=s1.length()) {
    			if(word[te].equals(wo)) {
    				ne[te]=wo;
    				System.out.print(ne[te]+" ");
    				if(siz<=8) {
    				siz=siz+1;
    				if(ge!=s1.length())
    				b=b+1;
    				int cp=0;
    				cp=1;
    				if(cp==1)
    					b=b-1;
    				}
    				ge=ge+1;
    				//System.out.println("Correct Guess at position"+te);
    				for(int tes=0;tes<c.length;tes++) {
    					if(wo.equals(c[tes])) {
    						c[tes]="";
    					}
    				}
    				
    			}else {
    				System.out.print(ne[te]+" ");
    				co=1;
    				  			}
    		  }
    			  
    	  }
    			if(co==1) {
  				  siz=siz-1;
  				  b=b-1;
  			  }
    	  }
    	  }
    	  if(ge==s1.length()) {
    		  System.out.println("Congratulations you won the game");
    		  System.out.println("Word is:"+s1);
    	  }
    	  else {
    	  System.out.println("Game over because of chances completion or you identified word");}
	} catch (IOException e) {
	  System.out.println("An error occurred.");
	  e.printStackTrace();
	}

	}
	

}
