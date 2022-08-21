package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
        
        WebElement SignUpButton = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
        SignUpButton.click();
        
        
        //Signing up using email address
        /*WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        WebElement LastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        WebElement Email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        WebElement EmailConf = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
        WebElement NewPassword = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
        
        FirstName.sendKeys("Harsh");
        LastName.sendKeys("Singh");
        Email.sendKeys("abc@xyz.com");
        EmailConf.sendKeys("abc@xyz.com");
        NewPassword.sendKeys("abc@1243");*/
        
        
        //Signing up using Mobile Number
        WebElement FirstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        WebElement LastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        WebElement Mobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        WebElement NewPassword = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
        
        FirstName.sendKeys("Harsh");
        LastName.sendKeys("Singh");
        Mobile.sendKeys("1234567890");
        NewPassword.sendKeys("abc@1243");
        
        //Setting date from date of birth drop down
        WebElement Day = driver.findElement(By.name("birthday_day"));
        
        Select ddDay = new Select(Day);
        ddDay.selectByVisibleText("30");
        
        WebElement Month = driver.findElement(By.name("birthday_month"));
        
        Select ddMonth = new Select(Month);
        ddMonth.selectByVisibleText("Apr");
        
        
        //to get current element in drop down
        System.out.println("Selected month is: " + ddMonth.getFirstSelectedOption().getText());
        
       
        //Finding all elements in drop down
        /*List<WebElement> Months = ddMonth.getOptions();
        
        for(WebElement elm: Months) {
        	System.out.println(elm.getText());
        }
        
        */
        
        List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name= 'birthday_month']/option"));
        
        for(WebElement elm: AllMonths) {
        	System.out.println(elm.getText());
        }
        
        WebElement Year = driver.findElement(By.name("birthday_year"));
        
        Select ddYear = new Select(Year);
        ddYear.selectByVisibleText("1997");
        
        //selecting radio button
        
        /*WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
        Gender.click();
        
        */
        
        //Other Method
        
        String Gender = "Custom";
		
	/*	WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		if(Gender.equals("Female")) {
			Female.click();
		}else if(Gender.equals("Male")) {
			Male.click();
		}else {
			Other.click();
		}
		
		*/

      /*  String Xpath = "//label[text()='" + Gender + "']/following-sibling::input";
        
        WebElement GendgerRadioBtn = driver.findElement(By.xpath(Xpath));
        GendgerRadioBtn.click();
        
        */
        
        String XPath = "//label[text()='PlaceHolder']/following-sibling::input"; //dynamic method 1
        
        
        String newxpath = XPath.replace("PlaceHolder", Gender);                  //dynamic method 2
        WebElement GenderRadioBtn = driver.findElement(By.xpath(newxpath));        
        GenderRadioBtn.click();

        
        //driver.close();
        
        }

}
