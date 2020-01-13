import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("Marionette", true);
		WebDriver driver = new ChromeDriver();
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		//driver.findElement(By.name("email")).sendKeys("akankshak999@gmail.com");
		
		//driver.findElement(By.className("common-checkboxIndicator")).click();
		//WebElement Chkbox=driver.findElement(By.name("DDecor"));
		//WebElement Chkbox = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label/text()"));
		
		
		/*/*RadioButton
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.className("table5")).click();
		WebElement Chkbox = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
		Chkbox.click();
		if(Chkbox.isSelected()){
			System.out.println("Check is on");
		}

		*/
		
		//Select
		/*driver.get("https://www.facebook.com/");
		Select drp=new Select(driver.findElement(By.id("day")));
		drp.selectByVisibleText("16");
*/
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/Selnium/Error.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
;		
		
	
		
		
	}

}
											