package plagarism;

import java.io.FileInputStream;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		String doc[]=new String [1000];
		  String doc1[]=new String [1000];
		  String fi[]=new String [10000];
		  int d1=0;
		  int d2=0;
		  int count2=0;
		   int count1=0;
	    	  
		// TODO Auto-generated method stub
		try{  
    	    FileInputStream fin=new FileInputStream("doc1.txt");  
    	    int i=0;  
    	   // FileWriter myWriter = new FileWriter("sample1.txt");
    	      String s="";
    	      String arr[]=new String[10000];
    	      int l=0;
    	      int co=0;
    	      
    	    while((i=fin.read())!=-1){  
    	    	String check="";
    	    	check=check+(char)i;
    	    	if(!(check.equals(".") ||check.equals(","))) {
    	    	s=s+(char)i;
    	    	count1=count1+1;
    	    	if((char)i==' ') {
    	    		arr[l]=s;
	    	    	l=l+1;
	    	    	 s="";
	    	    	 co=co+1;
	    	    	 count1=count1-1;
    	    	}  
    	    	}
    	    } 
    	    int t=0;
    	    String arr1[]=new String [10000];
    	    for(int z=0;z<l;z++) {
    	    	 int count=0;
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
    	    int d=0;
    		for(int w=0;w<t;w++) {
    	    	if(arr1[w]!=" ") {
    	    	 doc1[d]=arr1[w];
    	    	// System.out.println(doc1[d]);
    	    	 d++;
    	    	 d1++;
    	    	}
    		}
	    	     System.out.println("Number of words are:"+co);
	    	     System.out.println("Number of letter are:"+count1);
    	  fin.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
		//doc 2
		
		System.out.println("");
		System.out.println("");
		System.out.println("doc 2 start");
		
		try{  
		    
		 FileInputStream doc2=new FileInputStream("doc2.txt");  
 	    int i=0;  
 	      String s="";
 	      String arr[]=new String[10000];
 	      int l=0;
 	      int co=0;
 	    while((i=doc2.read())!=-1){  
 	    	String check="";
	    	check=check+(char)i;
	    	if(!(check.equals(".") ||check.equals(","))) {
	    		s=s+(char)i;
 	    	count2=count2+1;
 	    	if((char)i==' ') {
 	    		arr[l]=s;
	    	    	l=l+1;
	    	    	 s="";
	    	    	 co=co+1;
	    	    	 count2=count2-1;
 	    	}  
 	    	}
 	    } 
 	    int t=0;
 	    String arr1[]=new String [10000];
 	    for(int z=0;z<l;z++) {
 	    	 int count=0;
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
 	    int d=0;
 		for(int w=0;w<t;w++) {
 	    	if(arr1[w]!=" ") {
 	    	 doc[d]=arr1[w];
// 	    	System.out.println(doc[d]);
 	    	 d++;
 	    	 d2++;
 	    	}
 		}
	    	     System.out.println("Number of words are:"+co);
	    	     System.out.println("Number of letter are:"+count2);
 	  doc2.close();
   System.out.println("Successfully wrote to the file.");
 } catch(IOException e) {
   System.out.println("An error occurred.");
   e.printStackTrace();
 }
		System.out.println("");
		System.out.println("");
		System.out.println("final start");
		
		try {
		int o=0;
		int fo=0;
	for(int ver=0;ver<d1;ver++) {
		String str=doc1[ver];
		for(int ref=0;ref<d2;ref++) {
			String str1=doc[ref];	
				fi[o]=doc1[ver];
				System.out.println(fi[o]);
				o=o+1;
				fo=fo+1;
				break;
			}
	}
	long hj=1;
	for(int go=0;go<fo;go++) {
		int hi=fi[go].length();
		hj=hj*hi;
		}
	long fr=(hj/count1);
	fr=fr/1000000000;
	fr=fr/1000;
	System.out.println("The plagarism percentage is "+fr+"%");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

