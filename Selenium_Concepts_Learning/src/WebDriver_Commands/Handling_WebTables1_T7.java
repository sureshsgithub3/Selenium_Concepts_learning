package WebDriver_Commands;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_WebTables1_T7 {
	
	
	
	@Test
	public void handle_webtable(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//table heading
		WebElement table_heads=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr"));
		//table heading cells
		List<WebElement> table_head_cells=table_heads.findElements(By.tagName("th"));
		int hsize=table_head_cells.size();
		System.out.println(hsize);
		for(int i=0;i<hsize;i++){
			String head_text=table_head_cells.get(i).getText();
			System.out.print(head_text +"\t");
		}
		
		//table
		WebElement table= driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody"));
		//finding no of rows by tag name
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		//size of rows list
		int rsize= rows.size();
		System.out.println(rsize);
		
		for(int row=0;row<rsize;row++){
			//cell in to list by row wise
			List<WebElement> cells=rows.get(row).findElements(By.tagName("td"));
			// no of cells by each row
			int csize=cells.size();
			//printing no of cells
			//System.out.println(csize);
			//System.out.println("Row no is  :"+row + " no of cells :"+csize);
			
			for(int cell=0;cell<csize;cell++){
				
				String celltext=cells.get(cell).getText();
				System.out.print(celltext +" \t");
				
			}
			System.out.println("-----");
		}
		
		
		driver.close();
		
		
	}
	
	

}
