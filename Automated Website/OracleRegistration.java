package com.simplilearn.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Simplilearn Bootcamp\\Phase 5\\chromedriver_win32\\chromedriver.exe");
		
		//step:2 initializing chrome
		WebDriver driver= new ChromeDriver();
		
		//step:3 giving a base url
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
       
        try {
			Thread.sleep(3000);
			WebElement email= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
	        
	        email.sendKeys("niladrichowdhury87@gmail.com");
	        WebElement password=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
	        password.sendKeys("Niladri123$");
	        
	        WebElement retypepassword= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
	        retypepassword.sendKeys("Niladri123$");
	       
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       WebElement firstname= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:firstName::content\"]"));
       firstname.sendKeys("NIladri");
       
       WebElement lastname= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:lastName::content\"]"));
       lastname.sendKeys("Chowdhury");
       
       WebElement jobtitle= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:jobTitle::content\"]"));
       jobtitle.sendKeys("Full-Stack Engneer Trainee");
       
       WebElement workphone= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
       workphone.sendKeys("7003903670");
       
       WebElement companyname= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:companyName::content\"]"));
       companyname.sendKeys("Wipro");
       
       WebElement address= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]"));
       address.sendKeys("31st Camac Street");
       
       WebElement city= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:city::content\"]"));
       city.sendKeys("Kolkata");
       
       WebElement state= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:state::content\"]"));
       state.sendKeys("West Bengal");
       
       WebElement zip= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:postalCode::content\"]"));
       zip.sendKeys("700009");
       
       WebElement CreateAccount= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:subsecCreateAccount\"]"));
       CreateAccount.click();
	    
		
	}

}
