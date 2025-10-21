package BeforeTestExample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
 @Test
 void c1() {
	 System.out.println("c1");
    }
 
 @BeforeTest
 void before() {
	 System.out.println("this is before");
 }
}
