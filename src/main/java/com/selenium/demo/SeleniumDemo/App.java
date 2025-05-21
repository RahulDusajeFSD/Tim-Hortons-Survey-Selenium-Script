package com.selenium.demo.SeleniumDemo;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	
	static final int DELAY_VALUE=2500;
	
	
	
	   public static void main(String[] args) {
	    	
			 System.setProperty("webdriver.chrome.driver", "/Users/rahuldusaje/Documents/JAR_Files/chromedriver");

		     WebDriver driver = new ChromeDriver();
		        
		     driver.get("https://www.telltims.ca/");
		   	  
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter The Coupon code:");
	        String code = scanner.nextLine();
	        
	        System.out.println("Enter Employee name:");
	        String employeeName = scanner.nextLine();
	        System.out.println(employeeName);
	        
	       // 288256502110227050623
	      
	        runSurvey(driver, code, employeeName);
	    
	   
	    }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	public static void clickById(WebDriver driver, String id, Actions actions) {
		WebElement nextButton = driver.findElement(By.id(id));
		actions.moveToElement(nextButton).click().perform();
		
	}
	
	
	public static void fillContentById(WebDriver driver, String id, String content) {
		 WebElement searchBox = driver.findElement(By.id(id));
	        searchBox.sendKeys(content);
		
	}
	
	 public static void runSurvey (WebDriver driver, String code, String employeeName) {
	    	
		 

	    
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("Home_iframe__T3nfU")));
	     
		 
	        fillContentById(driver, "QR~QID9", code);

	        Actions actions = new Actions(driver);
	        
	        clickById(driver, "NextButton", actions);
	        	        
	           

	       try {
	    	   
	    	   
	    	   
			Thread.sleep(DELAY_VALUE);
			
			
			clickById(driver, "QID14-1-label", actions);
	        
			clickById(driver, "NextButton", actions);
			
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QID15-4-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        
	        Thread.sleep(DELAY_VALUE);
	        

	        fillContentById(driver, "QR~QID45", "Exceptional Service.");
	        
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QID18-5-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	              
	        
	        clickById(driver, "QID19-5-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	      
	        clickById(driver, "QID20-5-label", actions);
	        clickById(driver, "NextButton", actions);
	       
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QR~QID23~4~1", actions);
	        clickById(driver, "QR~QID23~6~1", actions);
	        clickById(driver, "QR~QID23~7~1", actions);
	        clickById(driver, "QR~QID23~8~1", actions);
	        clickById(driver, "QR~QID23~10~1", actions);
	        clickById(driver, "QR~QID23~11~1", actions);
	        clickById(driver, "NextButton", actions);
	        
	        
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver,"QR~QID44~1~1", actions);
	        clickById(driver,"QR~QID44~3~1", actions);
	        clickById(driver, "NextButton", actions);

	        Thread.sleep(DELAY_VALUE);
	        
	        
	        clickById(driver, "QID37-2-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QID134-2-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        
	        clickById(driver, "QID48-1-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	       
	        
	        clickById(driver, "QID53-1-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        
	        
	        clickById(driver, "QID57-1-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        
	        
	        clickById(driver, "QR~QID59~8~1", actions);
	        clickById(driver, "QR~QID59~9~1", actions);
	        clickById(driver, "QR~QID59~10~1", actions);
	        clickById(driver, "QR~QID59~1~1", actions);
	        clickById(driver, "QR~QID59~2~1", actions);
	        clickById(driver, "QR~QID59~3~1", actions);
	        clickById(driver, "QR~QID59~6~1", actions);
	        clickById(driver, "QR~QID59~7~1", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QID74-4-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        clickById(driver, "QID68-1-label", actions);
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	       
	        fillContentById(driver, "QR~QID69", employeeName);
	        
	        clickById(driver, "NextButton", actions);
	        
	        Thread.sleep(DELAY_VALUE);
	        
	        WebElement searchBox4 = driver.findElement(By.id("QR~QID70"));
	        searchBox4.sendKeys("Polite. Helpful. Courteous.");
	        clickById(driver, "NextButton", actions);
	        Thread.sleep(DELAY_VALUE);
	        
	        
	        
	        
	        WebElement endOfSurveyDiv = driver.findElement(By.id("EndOfSurvey"));

	       
	        WebElement validationCodeElement = endOfSurveyDiv.findElement(By.tagName("strong"));

	        String validationCode = validationCodeElement.getText();
	        System.out.println("Validation Code: " + validationCode);
	        
	        
	        
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	       
	 
	       
	        driver.quit();
	    }
	
	
	 
	 
	 
 
}
