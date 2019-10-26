package objectserialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable 
	  {
		public int marks = 94;
	              public String Grade="A+";
				private String value;
		 public static void main(String args[]) throws IOException 
	     {
		FileOutputStream fos = new FileOutputStream("temp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		SerializationDemo  sd = new SerializationDemo();
		oos.writeObject(sd);
		oos.flush();
		oos.close();
	     }
				 		public static void main1(String args[]) throws IOException 
		 	    {
		 		FileInputStream fis = new FileInputStream("temp.txt");
		 		ObjectInputStream oin = new ObjectInputStream(fis);
		 		SerializationDemo sd;
		 		try {
		 			sd = (SerializationDemo) oin.readObject();
		 			System.out.println("Marks="+sd.value);
		 	        System.out.println("Grade="+sd.Grade);
		 		} catch (ClassNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		
		 	}
		 }
