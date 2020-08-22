package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import BootCamp.PageObjectModelHomeDepot.Base;

import org.testng.ITestContext;


public class ilistners extends Base implements ITestListener {
	public void onStart(ITestContext context) {
		
		System.out.println("Test is started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("Test is passed");
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
  System.out.println("Test is failed");
	}
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("This is on test start");
	}

}
