package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniuminto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //close only browser which got originally open
	//	driver.quit(); //to close all associated window open by automation
		
		//firefox launch
		WebDriver driver1=new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","path for geckodriver");
		
		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
		WebDriver driver3 = new EdgeDriver();
		
	}

}
