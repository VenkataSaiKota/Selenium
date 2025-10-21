package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       try {
    	   FileWriter write=new FileWriter("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\v.txt");
    	   String sample="sjjfalskslj";
           write.write(sample);
           write.close();
       }
       catch(Exception e) {
    	   System.out.println("File not found"+e);
       }
        
        
//      
//        FileReader read=new FileReader("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\venkat.txt");
//        int val;
//        while((val=read.read())!=-1) {
//        	System.out.print((char)val);
//        }
//        read.close();
        
        
	}

}
