package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fReader=new FileReader("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\venkat.txt");
		BufferedReader reader=new BufferedReader(fReader);
		String fread;
		FileWriter fWriter=new FileWriter("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\ven.txt");
		BufferedWriter writer=new BufferedWriter(fWriter);
		
		while((fread=reader.readLine())!=null) {
			writer.write(fread);
			System.out.println(fread);
			
		}
	
		fReader.close();
		fWriter.close();
		reader.close();
		//writer.close();

	}

}
