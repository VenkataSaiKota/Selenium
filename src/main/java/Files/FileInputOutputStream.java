package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	 FileInputStream input=new FileInputStream("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\paarot.jpg.htm");
         
         FileOutputStream ouput=new FileOutputStream("C:\\Users\\2440823\\OneDrive - Cognizant\\Desktop\\paarot.jpg.htm");
         int byt;
         while((byt=input.read())!=-1) {
        	ouput.write(byt);
         }
         
    }
    catch(Exception e) {
    	System.out.println(e);
    }
     
	}

}
