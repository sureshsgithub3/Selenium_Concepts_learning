package Taking_ScreenShots;



import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Taking_Screen_For_FailedTests_Using_TestNg implements ITestListener {
	WebDriver driver;
	String Filepath="C:\\WorkSpaceFor_Luna\\Selenium_Concepts\\ScreenShotsFolder";

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("****** Error "+result.getName()+"Test has been failed");
		String methodname=result.getName().toString().trim();
		
		
	}
	
	public void takescreenshot(String methodname){
		//get driver
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	//this will test method on failure ,this code will take test method name as screen shot name and save it in folder
	//to do this  we need create a class and implements testng 'ITestlistner'
	
	
	
	
	
	
	
	

}
