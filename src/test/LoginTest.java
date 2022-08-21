package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
        
        // Step 1 - Click on Log in
        
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
        
        // step 2 - Enter username
        WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys("abc@xyz.com");
        
        // step 3 - Enter password
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Test@1234");
        
        // step 4 - click remember me
        WebElement Checkbox = driver.findElement(By.className("rememberMe"));
        Checkbox.click();
        
        // step 5 - click login button
        WebElement LoginButton = driver.findElement(By.name("btn_login"));
        LoginButton.click();
        
        // step 6 - validate error message
        WebElement Error = driver.findElement(By.id("msg_box"));
        
        String ActError = Error.getText();
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)) {
        	System.out.println("TEST CASE PASSED");
        }else {
        	System.out.println("TEST CASE FAILED");
        }
        
        // step 6.5 - finding all links in web page
        List<WebElement> Links = driver.findElements(By.tagName("a"));
System.out.println("Total num of links are " + Links.size());
        
        for(int index=0;index<Links.size();index++) {
            
            System.out.println(Links.get(index).getAttribute("href")); // to show all the attributes
            
        }
        
        // step 7 - close the browser
        driver.close();
        
        
	}

}
