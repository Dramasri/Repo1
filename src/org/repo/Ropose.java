package org.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ropose {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\eclipse\\MavenPrjt\\MavenAdac\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.facebook.com");
		
		driver.getTitle();
		
		String name = driver.getCurrentUrl();
		
		System.out.println(name);
		
		driver.quit();
		
		System.out.println("updated");
		
		driver.close();
		
		driver.get("www.amazon.in");
		
		driver.getTitle();
		
		driver.quit();
		
		
		
	}

}
