package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
        
        WebElement Selectfile = driver.findElement(By.name("uploadfile_0"));
        Selectfile.sendKeys("C:\\Users\\Harsh Vardhan Singh\\Desktop\\SampleFile.txt");
        
        WebElement TnC = driver.findElement(By.id("terms"));
		TnC.click();

		WebElement SubmitButton = driver.findElement(By.id("submitbutton"));
		SubmitButton.click();

	}

}
