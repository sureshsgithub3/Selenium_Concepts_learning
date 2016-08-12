package WebDriver_Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handling_WebTable_T7 {

	
	@Test
	public void Handle_Webtable(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//locating table
		WebElement table=driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody"));
		
		//to locate rows of the table
		List<WebElement> tble_rows=table.findElements(By.tagName("tr"));
		//to calculate no of rows
		int rows_size=tble_rows.size();
		//printing size of rows
		//System.out.println(rows_size);
		//loop will xecute  till the last row
		for(int i=0;i<rows_size;i++){
			List<WebElement> tble_cells=tble_rows.get(i).findElements(By.tagName("td"));
			//to get size of cells
			int cell_size=tble_cells.size();
			//printing cell size
			//System.out.println(cell_size);
			
			
			// loop will exceute till the last cell of the row 
			for(int j=0;j<cell_size;j++){
				String celltext=tble_cells.get(j).getText();
				System.out.print(celltext+" \t");
				
			}
			System.out.println("------------------------");
		}
		driver.close();
		
		
	}
}
