package WebDriverEventListeners;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebeventListener implements WebDriverEventListener {
	
	
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("before navigate "+ url +" '");
		
	}
	
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("after navigate to :"+ url +" '");
		
	}
	
	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("value of the :"+element.toString()+"before any changes made ");
		
	
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("value of the :"+element.toString());
		
	}
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("trying to click on :"+element.toString());
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver element) {
		System.out.println("trying to click on :"+ element.toString());
		
	}
	@Override
	public void beforeNavigateBack(WebDriver driver) {
	    System.out.println("navigating back to previous");
		
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("navigated back to previous page");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("navigating to next page");
		
	}
	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("navigated to next page");
		
	}
	@Override
	public void onException(Throwable error, WebDriver driver) {
		
		System.out.println("Exception :"+error);
	}
	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("trying find element: "+by.toString());
		
	}
	
	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found Element by :"+by.toString());
		
	}
/*
 * non overriden methods of weblistner class 
 * 
	

	*/

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
		
	}

    //==================beforeNavigateRefresh================
	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	
	

}
