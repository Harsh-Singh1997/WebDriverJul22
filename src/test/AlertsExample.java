package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
        
        WebElement Button1 = driver.findElement(By.id("alertButton"));
        Button1.click();
        
        Alert Alert = driver.switchTo().alert();
        System.out.println(Alert.getText());
        Alert.accept();
        
        WebElement Button2 = driver.findElement(By.id("confirmButton"));
        Button2.click();
        
        Alert Alert2 = driver.switchTo().alert();
        System.out.println(Alert2.getText());
        Alert2.dismiss();
        
        WebElement Button3 = driver.findElement(By.id("promtButton"));
        Button3.click();
        
        Alert Alert3 = driver.switchTo().alert();
        System.out.println(Alert3.getText());
        Alert3.sendKeys("Hello World");
        Alert3.accept();
         
        
	}

}
