package BeforeTestExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Demo2 {
	 @Test
	 void c2() {
		 System.out.println("c2");
	    }
	 
	 @AfterClass
	 void after() {
		 System.out.println("this is after");
	 }
}
