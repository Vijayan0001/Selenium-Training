package org.selenium.training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {
	
 public static void main(String[] args) {
	 
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement txtUser = driver.findElement(By.id("email"));
	 txtUser.sendKeys("Vijayan");
	 
	 WebElement txtPass = driver.findElement(By.id("pass"));
	 txtPass.sendKeys("8765234");
	 
	 WebElement btnLogin = driver.findElement(By.name("login"));
	 btnLogin.click();
	 
	 WebElement signUp = driver.findElement(By.xpath(("//a[text()='Sign up for Facebook']")));
	 signUp.click();
	 
	 
	 
	 
	 
	 
	
}
}
