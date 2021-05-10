package ListenerInTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Starting of test case "+result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(" testcase pass "+result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		System.out.println(" test case failed "+result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case skipped "+result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		System.out.println("Starting of process "+context.getName());
		
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("Finishing of process "+context.getName());
		
	}
	
	

}
