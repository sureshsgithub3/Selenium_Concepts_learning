package WebDriverEventListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class Web_Event_Listner extends AbstractWebDriverEventListener {
	
	
	public void beforeNavigateTo(String url,WebDriver driver){
		System.out.println("before navigate to: "+ url +" ");
		
	}
	
	public void afterNavigateTo(String url,WebDriver driver){
		System.out.println("After navigate to :"+url+" ");
	}
	
	public void beforeClickOn(WebElement element,WebDriver driver){
		System.out.println("trying to click  on :"+element.toString());
	}
	
	public void afterClickOn(WebElement element ,WebDriver driver){
		System.out.println("Clicked on :"+element);
	}
	
	public void onException(Throwable error, WebDriver driver){
		System.out.println("Error occurred :"+error);
	}

}
