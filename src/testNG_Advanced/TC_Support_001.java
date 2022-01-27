package testNG_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Support_001 {
	
	@DataProvider
	public String[] sendMobileInfo() {
		String[] arr= {"iphone","redmi","poco","oneplus"};
		return arr;
	}
	
	
	@Test(dataProvider="sendMobileInfo")
	public void  createARequest(String mobileName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtexbox")).sendKeys(mobileName,Keys.ENTER);
	}

	}
	


