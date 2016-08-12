package WebDriver_Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handling_CheckBoxes_T5 {
	
	@Test
	public void handlingCheckBoxes(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//storing check boxes in list
		List<WebElement> chckbxs= driver.findElements(By.name("profession"));
		
		int size= chckbxs.size();
		System.out.println("total no of boxes are  :"+size);
		
		for(int i=0;i<size;i++){
			String testing=chckbxs.get(i).getAttribute("value");
			
			if(testing.equalsIgnoreCase("Manual Tester"));
			
			chckbxs.get(i).click();
			boolean bvl= chckbxs.get(i).isSelected();
			System.out.println(bvl);
			break;
		}
		//driver.close();
	}

}
