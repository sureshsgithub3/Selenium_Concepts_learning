package WebDriverEventListeners;

import java.util.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Log4J.WebEventListener;

public class Event_Listner_Example {
	
	
            private WebDriver driver;
            private EventFiringWebDriver e_driver;
            private WebeventListener evelstnr;
            //private Web_Event_Listner evntlstr;
            private WebDriverWait wait;
            private String appurl="http://www.google.com";
            public int waittime =5;
            private String headertext="One account. All of Google.";
            private String errmessage="The email and password you entered don't match.";
            
            @BeforeClass
            public void setup(){
            	//Initializing instance of firefox webDriver
            	driver = new FirefoxDriver();
            	wait= new WebDriverWait(driver,waittime);
            	
            	//initializing eventfiringwebdriver  using firefox webdriver instance
            	e_driver= new EventFiringWebDriver(driver);
            	
            	//now create object of event listner handler to register ot with eventfiring webdriver
            	//evntlstr= new Web_Event_Listner();
            	evelstnr= new WebeventListener();
            	
            	e_driver.register(evelstnr);
            	e_driver.manage().window().maximize();
            	e_driver.get(appurl);
            }
            @Test
            public void testEventone(){
            	System.out.println("********** executing test one************");
            	e_driver.findElement(By.linkText("Gmail")).click();
            	String pageheadertext=e_driver.findElement(By.tagName("h1")).getText();
            	Assert.assertTrue(pageheadertext.equalsIgnoreCase(headertext));
            	
            }
            
            
            @Test
            public  void testEventstwo(){
            	System.out.println("********** executing test two************");
            	//enterting username and click on next
            	e_driver.findElement(By.id("Email")).sendKeys("idboapp@gmail.com");
            	e_driver.findElement(By.id("next")).click();
            	
            	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
            	//entering the password
            	e_driver.findElement(By.id("Passwd")).sendKeys("pass@word");
            	e_driver.findElement(By.id("signIn")).click();
            	
            	//get the error message and vlaidate it
            	String pageheadertext=e_driver.findElement(By.id("errormsg_0_Passwd")).getText();
            	Assert.assertTrue(pageheadertext.equalsIgnoreCase(errmessage));
            }
            
            @AfterClass
            public void teardown(){
            	if(e_driver !=null){
            		e_driver.quit();
            	}
            }

}
