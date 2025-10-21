package CognizantTestngPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample  implements ITestListener{
	
	public  void onTestStart(ITestResult result) {
	   System.out.println("test is started ");
	  }

	 
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("test is sucess ");
	  }

	 
	  public  void onTestFailure(ITestResult result) {
		  System.out.println("test is failed ");
	  }

	  public  void onTestSkipped(ITestResult result) {
		  System.out.println("test is skipped ");
	  }
	  public  void onStart(ITestContext context) {
		   
		  System.out.println("test is onstart ");
	  }

		 
	 public  void onFinish(ITestContext context) {
		 System.out.println("test is onfinish ");
		   
		  }

}
