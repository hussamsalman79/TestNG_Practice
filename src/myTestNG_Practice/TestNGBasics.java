package myTestNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hkarmah\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
	}

	@Test(priority=1)
	public void verifyPageTitleTest() {

		String title = driver.getTitle();
		System.out.println("Tilte is " + title);
		Assert.assertEquals(title, "Free CRM software for any business with sales, support and customer relationship management");
	}
	
	
	@Test(priority=2)
	public void verifyFreeCRMLLogoTest() {
		boolean flag = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed(); 
		Assert.assertTrue(flag); 
	}
	
	@Test(priority=3)
	public void verifyFreeCRMLLogoTest1() {
		boolean flag = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed(); 
		Assert.assertTrue(flag); 
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
