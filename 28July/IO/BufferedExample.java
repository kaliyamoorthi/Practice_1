package IO;
import java.io.*;
public class BufferedExample {
	
		  public static void main(String[] argv) throws IOException {
		    BufferedReader br = new BufferedReader(
		    		new FileReader("file1"));
		    //FileReader obj=new FileReader("D://register.txt");
		    //BufferedReader br=new BufferedReader(obj);
		    
		    BufferedWriter bw = new BufferedWriter(
		    		new FileWriter("file3"));
		    int i;
		   do{	    
		      i = br.read();  
		      if (i != -1) {
		       
		          bw.write((char) i);
		      }
		    } while (i != -1);
		    br.close();
		    bw.close();
		    BufferedReader br1 = new BufferedReader(new FileReader("file3"));
		    do{	    
			      i = br1.read();
			      if (i != -1) {
			       
			         System.out.print((char) i);
			      }
			    } while (i != -1);
		  
		  br1.close();
		}}


