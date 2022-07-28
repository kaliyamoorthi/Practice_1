package IO;
import java.io.*;
public class BufferedExample1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("file1");
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("file2");
		BufferedWriter bw=new BufferedWriter(fw);
		int ch;
		do{
			ch=br.read();
			//System.out.print((char)ch);
			if(ch!=-1)
			bw.write((char)ch);
		}while(ch!= -1);
		fr.close();
		br.close();
		fw.close();
	//	bw.close();
		
		

	}

}
